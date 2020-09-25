package xiancheng.Thread;

import sun.applet.Main;

import java.util.concurrent.TimeUnit;

/**
 * @author zhangrongchuan
 * @data 2020-07-2020/7/21-10:21
 * @Description
 *
 *
 * Volatile关键字，使一个变量在多个线程中可见
 * A B线程都用到一个变量，java默认是A线程中保留一份copy，这样
 * B线程修改了该变量，A线程未必知道。
 * 使用Volatile，会让所有线程读到变量的修改值
 *
 * 在下面的代码中，running是存在于堆内存的t对象中
 * 当线程t1开始运行时，会把running值从内存中读到t1线程的工作区，
 * 在运行过程中直接使用这个copy，并不会每次都去读取堆内存，这样，
 * 当主线程修改running的值之后，t1线程感知不到，所以不会停止运行
 *
 * 使用volatile，将会强制将所有的线程都去堆内存中读取running的值
 *
 * volatile并不能保证多个线程同时修改running变量时所带来的不一致问题，
 * 也就是说volatile不能替代synchronized
 *
 *
 *
 * volatile作用：
 * 1.保证线程的可见性
 *  MESI cpu的缓存一致性协议
 * 2.禁止指令重排序
 *  DCL单例
 *  double check lock
 * 
 */
public class ThreadDemo09Volatile {
  /*volatile */boolean running = true;
    void m(){
        System.out.println("m strat");
        while (running){
//            try{
//                TimeUnit.MICROSECONDS.sleep(10);
//            }catch(Exception e){
//                e.printStackTrace();
//            }
        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        ThreadDemo09Volatile t = new ThreadDemo09Volatile();

        new Thread(t::m ,"t1").start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                t.m();
//            }
//        },"t2").start();
        try{
            TimeUnit.MICROSECONDS.sleep(1);
        }catch(Exception e){
            e.printStackTrace();
        }

        t.running= false;
    }
}
