package xiancheng;

import com.google.common.util.concurrent.*;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
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
 * 2.guava是第三方的类库，jdk1.8被官方代替了。CompletableFuture
 *
 */
public class Future_AlibabaInterview02_Completable {
    public static void main(String[] args) throws IOException {
        final MyTask task1 = new MyTask("task1",3,true);
        MyTask task2 = new MyTask("task2",4,true);
        MyTask task3 = new MyTask("task3",1,false);

        //supplyAsync异步执行
        CompletableFuture f1 = CompletableFuture.supplyAsync(() -> task1.call())
                .thenAccept((result) -> callback(result));
        CompletableFuture f2 = CompletableFuture.supplyAsync(() -> task2.call())
                .thenAccept((result) -> callback(result));
        CompletableFuture f3 = CompletableFuture.supplyAsync(() -> task3.call())
                .thenAccept((result) -> callback(result));

        System.in.read();

    }

    private static void callback(Boolean result) {
        if(false == result){
            System.exit(0);
        }
    }


    //封装任务
    private static class MyTask{
        private String name;
        private int timeInSeconds;
        private boolean ret;

        public MyTask(String name, int timeInSeconds, boolean ret) {
            this.name = name;
            this.timeInSeconds = timeInSeconds;
            this.ret = ret;
        }

        public Boolean call(){
            //模拟业务执行的时间
            try{
                Thread.sleep(timeInSeconds);
            }catch(Exception e){
                e.printStackTrace();
            }

            System.out.println(name  + "task callback");
            return ret;
        }
    }


}
