package xiancheng.Thread;

import java.util.concurrent.TimeUnit;

/**
 * 可重入锁
 * <p>
 * 方法1调用方法2，两方法都加锁，使用同一锁，被调用方法是可以进锁的。
 * 包括子类重写父类方法，调用super.被重写方法，双方都加synchronized，也可以调用
 *
 * 如果不是可重入锁，m1就会死锁。
 */

public class ThreadDemo05synchronized5Kechongru {

    String name;
    double balance;

    public synchronized void m1() {
        System.out.println("m1 start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        m2();
    }

    public synchronized void m2() {
        System.out.println("m2 start");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new ThreadDemo05synchronized5Kechongru().m1();

    }
}
