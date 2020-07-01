import com.sun.deploy.util.StringUtils;
import sun.security.util.Length;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 下载excel，自动生成zd
 */
public class Test02 {

    public static void main(String[] args) {
        String[] args1 = new String[]{"aaa","bbb","ccc"};
        String[] sqlArgs = new String[]{"ypspm","ypspm","ypywm","gljxmc","jxmc","bsjx","fylb","yplx","cfgg","bzdwmc",
                "bzcz","bzfs","ggbz","bznhsl","yydwmc","jkybz","scqymc","wtqymc","jkfbqymc","pzwh","bwm","jybz","shzbbz",
                "dxbz","mzbz","jsbz","fsbz","otcbz","yybz","cbzjbz","tgyzxpj","cxybs","gkbz","jtbz","kssbz","xzsybz",
                "kabs","sfdlcgzbpz","ypfbsj","dbzjbzbz","zxybz","yppzm" ,"hl" ,"hldw" ,"zl" ,"zldw","fyts","mlbm",
                "yj","sg","yxqx","yxqdw","gwj","sqlx","gwlxl1","gwlxl2"};

        StringBuffer sql = new StringBuffer();
        sql.append("select \n");
        for (int i = 0 ;i<sqlArgs.length;i++){
//            System.out.println(sqlArgs[i]+" zd"+(i+1));
            sql.append(sqlArgs[i]+" zd"+(i+1));
            if(i != sqlArgs.length-1){
                sql.append(",");
            }
        }
        sql.append("\n");
        
        sql.append("from tb");
        System.out.println(sql.toString());



        String[] titleArgs = new String[]{"烦烦烦","吹风扇反思反思"};
        List<String> list = Arrays.asList(titleArgs);
        String str = StringUtils.join(list,",");
        System.out.println(str);

    }
}
