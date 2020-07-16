package xiancheng;

/**
 * synchronized 关键字
 * 给某个对象加锁
 *
 * 原理是，加锁的对象的前两位什么什么码需要一样。也就是说，锁的一个对象，才是锁在一起。
 */

public class ThreadDemo05synchronized {

    private int count = 10;
    private Object o = new Object();

    public void m() {
        synchronized (o) {//任何线程要执行下面的代码，必须先拿到o的锁
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }

}
