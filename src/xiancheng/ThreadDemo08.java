package xiancheng;

/**
 * @author zhangrongchuan
 * @data 2020-07-2020/7/16-15:43
 * @Description
 *
 *
 * synchronized具体实现
 * jdk早期时，是非常重量级的：都要找os去申请锁。效率极低。
 * 后来改进：
 *  1.锁升级的概念：
 *      我就是厕所所长(1,2)
 *
 *第一个线程：sync (Object)
 * markword 记录这个线程(的id)，是不真实加锁的，叫做【偏向锁】
 * 如果有线程征用，升级为【自旋锁】(占用cpu)。循环等待第一个线程的锁。
 * 旋转10次以后，还的不到锁，升级为【重量级锁】(不占用cpu)，去os申请资源。
 *
 *总结：执行时间长，线程数量多，用系统锁
 * 执行时间短，线程数量少，用自旋锁
 *
 *
 */
public class ThreadDemo08 {
}
