package javaSftp;

/**
 * @author zhangrongchuan
 * @data 2021-01-2021/1/18-9:55
 * @Description 给一个字符串，指定位数，不足的补空格
 */
public class Bzws {
    public static void main(String[] args) {
        String str = "我是123";
        int width = 20;
        for(int i = 0;i<width;i++){
            try{
                System.out.println(str.charAt(i));
            }catch(StringIndexOutOfBoundsException e){
                StringBuffer kgbf = new StringBuffer();
                for(int j = 0;j<width-i;j++){
                   kgbf.append(" ");
                }
                str = str + kgbf;
                break;
            }
        }
        System.out.println(str);
        System.out.println(str.length());
    }
}
