package xiancheng;

import com.google.common.util.concurrent.*;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

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
 *      @Override run(void)是没有返回值的。
 *      而
 *      Callable可以有返回值
 *      但是，参考CallableDemo01，get为阻塞请求，
 *      如果要获取A、B、C三个线程中的C的get，最坏情况需要等待A、B结束
 *
 *      针对这个问题，谷歌的guava 改进Future，拿到值后，进行一个callBack，直接拿走。也就是监听器
 *
 */
public class Future_AlibabaInterview01_Guava {
    public static void main(String[] args) {
        /**
         * 方法1
         * 需要导入guava的依赖
         */
        //监听线程池
        ListeningExecutorService service =
                //用到装饰设计模式。为线程池装饰上ListeningDectorator，监听装饰
                MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(2));
        ListenableFuture<Integer> future = service.submit(new Callable<Integer>() {
            public Integer call() throws Exception {
                return 8;
            }
        });
        /**
         *
         * 上面参考demo01，也就是pool.submit了Callable，返回了future
         * 下面代码，获得了future，要看是否有事件发生在future上。future, new FutureCallback<Integer>()
         */

        Futures.addCallback(future, new FutureCallback<Integer>() {
            public void onSuccess(@Nullable Integer integer) {
                System.out.println(integer);
            }

            public void onFailure(Throwable throwable) {
                throwable.printStackTrace();
            }
        },service);




        service.shutdown();
    }




}
