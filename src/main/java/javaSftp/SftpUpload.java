package javaSftp;

import com.jcraft.jsch.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Vector;

/**
 * @author zhangrongchuan
 * @data 2021-01-2021/1/15-15:20
 * @Description
 */
public class SftpUpload {
    public static void main(String[] args) {
        Session session = null;
        Channel channel = null;
        try {
            JSch jsch = new JSch();
            // getSession(String username, String host, int port), 默认端口号是22
            session = jsch.getSession("wd", "168.10.48.153", 22);
            session.setPassword("yonyou2020");
            Properties config = new Properties();
            // Jsch优先使用RSA key type密钥的方式登陆
            // 此处使用用户名和密码方式登录
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            // 设置登陆超时时间为30秒
            session.connect(30000);
            System.out.println("连接会话开启成功！");
            //创建sftp通信通道
            channel = session.openChannel("sftp");
            channel.connect(3 * 1000);
            System.out.println("SFTP连接成功");

            ChannelSftp sftp = (ChannelSftp) channel;
            // 进入服务器指定的文件夹,本案例测试环境是linux服务器


            //检测月份
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String time = sdf.format(new Date());
//            String year = time.substring(0,4);
//            String month = time.substring(5,7);

            String year = "2021";
            String month = "02";
            String tempPath = "sftp/wd/test/upload"+"/"+year+"/"+month;
            try{
                sftp.cd(tempPath);
            }catch(SftpException  e){
                sftp.mkdir(tempPath);
            }
            // 列出服务器指定的文件列表
//            Vector v = sftp.ls("*");
//            for (int i = 0; i < v.size(); i++) {
//                System.out.println(v.get(i));
//            }

            // 以下代码实现从本地上传一个文件到服务器/usr/uploadFileName.txt文件，如果要实现下载，对换以下流就可以了
            String filename = "ftp.md";
            OutputStream outstream = sftp.put("/sftp/wd/test/upload/2021/1/"+filename);
            InputStream instream = new FileInputStream(new File("C:/Users/Administrator/Desktop/ftp.md"));

            byte b[] = new byte[1024];
            int n;
            while ((n = instream.read(b)) != -1) {
                outstream.write(b, 0, n);
            }

            outstream.flush();
            outstream.close();
            instream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.disconnect();
            channel.disconnect();
        }

    }
}
