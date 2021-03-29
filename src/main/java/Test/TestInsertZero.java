package Test;

/**
 * @author zhangrongchuan
 * @data 2020-11-2020/11/20-14:11
 * @Description
 */
public class TestInsertZero {

    public static void main(String[] args) {
        String je = "1234.56";
        String fje = "-1234.56";

        //je

        if(je.length()<10){
            StringBuffer sb = new StringBuffer();
            sb.append(je);
            for(int i =0 ;i<(10-je.length());i++){
                sb.append(" ");
            }
            System.out.println(sb.toString());
            System.out.println(sb.toString().length());
        }else{
            System.out.println(je);
        }

    }
}
