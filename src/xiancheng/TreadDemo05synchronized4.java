package xiancheng;

import java.util.concurrent.TimeUnit;

/**
 * synchronized 关键字
 * 给某个对象加锁
 * <p>
 * <p>
 * 模拟银行账户，
 * 给业务写方法加锁
 * 给业务读方法不加锁
 *
 * 会读到中间变量
 *
 *
 *
 * 都加锁读最后变量
 */

public class TreadDemo05synchronized4 {

    String name;
    double balance;

    public synchronized void set(String name, double balance) {
        this.name = name;

//
//        try{
//            Thread.sleep(2000);
//        }catch(Exception e){
//            e.printStackTrace();
//        }

        this.balance = balance;
    }



    public synchronized double getBalance(String name) {
        return this.balance;
    }
//    public  double getBalance(String name) {
//        return this.balance;
//    }

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();   //获取开始时间

        TreadDemo05synchronized4 a = new TreadDemo05synchronized4();
        new Thread(() -> a.set("zhangsan", 100.0)).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(a.getBalance("zhangsan"));
//        try {
//            TimeUnit.SECONDS.sleep(2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(a.getBalance("zhangsan"));


        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

    }
}
