package xiancheng;

import sun.applet.Main;

/**
 * @author zhangrongchuan
 * @data 2020-06-2020/6/30-14:38
 * @Description
 *
 * 同步方法和非同步方法能否同时调用
 * 可以
 */
public class TreadDemo06 {
    public  synchronized void m1(){
        System.out.println("m1");
    }

    public void m2(){
        System.out.println("m2");
    }


    public static void main(String[] args) {
        TreadDemo06 t = new TreadDemo06();

        new Thread(t::m1,"t1").start();
        new Thread(t::m2,"t2").start();
        new Thread(t::m2).start();
    }

}
