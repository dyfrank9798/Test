package xiancheng.Thread;

import java.util.concurrent.TimeUnit;

/**
 * 程序在执行过程中，如果出现异常，默认情况锁会被释放
 * 所以，在并发处理的过程中，有异常要多加小心，不然会发生不一致情况
 * 比如：在一个webapp处理过程中，多个servlet线程同时访问一个资源，这时候处理异常并不合适
 * 在第一个线程中抛出异常，其他线程会进入同步代码区，有可能会访问到异常产生时的数据。
 * 因此需要特别小心
 */
public class ThreadDemo07ExceptionAndSynch {
    int count = 0;
    synchronized void m(){
        System.out.println(Thread.currentThread().getName()+":strat");
        while (true){
            count++;
            System.out.println(Thread.currentThread().getName()+":count="+count);
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){
                e.printStackTrace();
            }
            if(count ==5){
                int i = 1/0;//此处抛出异常，锁会被释放。不释放需要进行catch
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        ThreadDemo07ExceptionAndSynch t = new ThreadDemo07ExceptionAndSynch();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                t.m();
            }
        };
        new Thread(r,"t1").start();
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch(Exception e){
            e.printStackTrace();
        }

        new Thread(r,"t2").start();
    }
}
