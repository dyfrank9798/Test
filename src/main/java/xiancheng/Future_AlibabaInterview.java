package xiancheng;

/**
 * @author zhangrongchuan
 * @data 2020-07-2020/7/17-15:58
 * @Description
 *
 *
 * 面试题描述：
 * 有这样一个任务T：
 * T由N个子任务构成，每一个子任务完成的时长不同，
 * 若其中有一个子任务失败，所有任务结束，T任务失败，请写程序模拟这个过程
 *
 *
 *
 * 1.首先需要线程需要返回值
 * new Thread(),new Runnable()
 *      @Override run(void)
 *      Callable可以有返回值
 *      但是，参考CallableDemo01，get为阻塞请求，
 *      如果要获取A、B、C三个线程的get，最坏情况需要等待A、B结束
 *
 *      针对这个问题，谷歌的guava 改进Future，拿到值后，进行一个callBack，直接拿走。也就是监听器
 *
 */
public class Future_AlibabaInterview {
    public static void main(String[] args) {
        ListeningExcutorService service

    }




}
