package xiancheng;

/**
 * synchronized 关键字
 * 给某个对象加锁
 *
 * 锁定当前对象
 */

public class TreadDemo05synchronized2 {

    private int count = 10;
    public void m() {
        synchronized (this) {//任何线程要执行下面的代码，必须先拿到o的锁
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }

}
