package xiancheng;

/**
 * sleep 暂时休眠一段时间
 * Yield 谦让的退出，回到等待队列里，等待cpu调用
 * join 麻烦你跑到，t1.join ，t1去先运行。t1运行完了，再回来继续运行
 *
 *
 *
 * 关闭线程=让这个线程正常结束
 *  .stop过于粗暴，会产生状态不一致,现在不建议使用,就当没有。
 *  .interrupt 打断。打断进程肯定会抛出一个异常Exception。需要自己catch。并不能结束线程，也不建议用于业务逻辑。
 *
 */
public class ThreadDemo03sleep {

    public static void main(String[] args) {
//        sleep();
//        yield();
        join();
    }

    static void sleep(){
        new Thread(()->{
            for(int i =0;i<100;i++){
                System.out.println("A"+i);
                try {
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }


    static void yield(){
        new Thread(()->{
            for(int i =0;i<100;i++){
                System.out.println("A"+i);
               if(i%10 ==0 ){
                   Thread.yield();
               }
            }
        }).start();
    }

    static void join(){
        Thread t1  = new Thread(()->{
            for(int i =0;i<100;i++){
                System.out.println("A"+i);
            }
        });


        Thread t2  =new Thread(()->{
            try {
                System.out.println("T2");
                t1.join();
                System.out.println("End");
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }

}
