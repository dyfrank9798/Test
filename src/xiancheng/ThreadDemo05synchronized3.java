package xiancheng;

/**
 * synchronized 关键字
 * 给某个对象加锁
 *
 *
 * m1:锁定对象
 * m2:锁定方法 等价m1
 *
 *
 * m3:static锁定，没有this.锁定class(对象)，编译过后的class对象
 * m4  等价m3
 */

public class ThreadDemo05synchronized3 {

    private int count = 10;
    private static int count1 = 10;


    public void m1() {
        synchronized (this) {//任何线程要执行下面的代码，必须先拿到o的锁
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }
    public  synchronized void m2() {
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public  static synchronized void m3() {
        count1--;
        System.out.println(Thread.currentThread().getName() + " count1 = " + count1);
    }

    public static void mm(){
        synchronized (ThreadDemo05synchronized3.class){
            count1--;
        }

    }

}
