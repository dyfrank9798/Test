package xiancheng.callable;
import java.util.concurrent.*;

/**
 * @author zhangrongchuan
 * @data 2020-07-2020/7/17-16:02
 * @Description
 */
public class callableDemo01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /**
         * 运行Callable时，会调用call方法。与run方法的区别就是是否有返回值。返回值由泛型来指定
         */
        Callable<String> c = new Callable<String>() {
            public String call() throws Exception {
                return "Hello Callable";
            }
        };

        ExecutorService service = Executors.newCachedThreadPool();
        /**
         * Future相当于，submit送车去修，拿回来的回执单
         */
        Future<String> future = service.submit(c);//submit异步执行
        System.out.println(future.get());//get阻塞。。多此一举。。目前是有问题的
        service.shutdown();
    }
}
