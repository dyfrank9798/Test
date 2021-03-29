package Test;

/**
 * @author zhangrongchuan
 * @data 2020-12-2020/12/2-18:36
 * @Description
 */
public class Demo {
    private boolean demo01 (){
        int  x = 1;
        return x==1?true:false;
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.demo01());
    }
}
