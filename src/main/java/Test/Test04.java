package Test;

/**
 * @author zhangrongchuan
 * @data 2020-07-2020/7/30-16:18
 * @Description
 */
public class Test04 {
    public  String str ="6";
    public  StringBuffer stringBuffer =new StringBuffer("6");
    public static void main(String[] args) {
        Test04 t1 = new Test04();
        Test04 t2 = new Test04();
//        System.out.println(t.str);
//        System.out.println(t.stringBuffer.toString());
//        t.change1(t.str);
//        t.change2(t.stringBuffer);
//        System.out.println(t.str);
//        System.out.println(t.stringBuffer.toString());
        t1.change3(t2);
        t1.change3(t1);
        System.out.println(t1.str);
        System.out.println(t1.stringBuffer.toString());
        System.out.println(t2.str);
        System.out.println(t2.stringBuffer.toString());
    }

    public void change1(String str1){
        str ="10";
    }
    public void change2(StringBuffer str1){
        stringBuffer = new StringBuffer("10");
    }
    public void change3(Test04 t){
        t.str="1";
        t.stringBuffer= new StringBuffer("1");
    }
}
