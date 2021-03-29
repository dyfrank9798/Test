package xiancheng.Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangrongchuan
 * @data 2020-12-2020/12/7-17:25
 * @Description
 * volatile只能保证数据的可见性，但是不能替换synchronized，保证不了原子性
 *
 */
public class ThreadDemo10Volatile2 {
    volatile int count = 0;
    void m(){
        for(int i =0;i<10000;i++){
            /**
             * count++ 并不是原子性操作
             * 首先volatile 的count 确实具有可见性。但是可能2，3线程同时读到1的
             * 数据，再同时进行count++，最后count还是2.但是走了三个线程了已经
             */
            count ++;
        }
    }


    public static void main(String[] args) {
        ThreadDemo10Volatile2 t = new ThreadDemo10Volatile2();
        List<Thread> threads = new ArrayList<>();
        for(int i =0;i<10;i++){
            threads.add(new Thread(t::m,"thread-"+i));
        }
        threads.forEach((o) -> o.start());
        threads.forEach((o) -> {
            try{
                o.join();
            }catch(Exception e){
                e.printStackTrace();
            }
        });
    }
}
