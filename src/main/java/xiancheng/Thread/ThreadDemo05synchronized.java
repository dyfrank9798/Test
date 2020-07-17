package xiancheng.Thread;

/**
 * synchronized 关键字
 * 给某个对象加锁
 *
 * 原理是，加锁的对象的前两位什么什么码需要一样。也就是说，锁的一个对象，才是锁在一起。
 *
 * 不可以用String常量 Intger Long这种数据类型
 * String常量：“object”
 * 假如是一个jar包内的字符串常量，两个都调用这个jar包，都锁了，就出大问题
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
