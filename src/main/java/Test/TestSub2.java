package Test;

/**
 * @author zhangrongchuan
 * @data 2020-10-2020/10/19-16:11
 * @Description
 */
public class TestSub2 {
    public static void main(String[] args) {
        String str = "1234335522220000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
//        System.out.println(str.substring(0, 4));
//        System.out.println(str.length());
//        System.out.println(5/4);
        if((str.length())/4!=0){
            System.out.println("有余数");
            System.out.println("格式错误");
        }else{
            int i = 0;
            int j = 4;
            for(int index = 0 ;index < (str.length())/4;index ++){
            System.out.println(str.substring(i,j));
                i=i+4;
                j=j+4;
            }
        }

    }

}
