package xiancheng.Thread;

/**
 * 启动线程的三种方式
 * 1.继承Thread
 * 2.实现Runnable接口
 * 3.通过线程池(Excutors.newCachedThread)
 * 这里只展示12种
 */
public class ThreadDemo02 {

    private static class MyThread  extends  Thread{
        public void run(){
            System.out.println("MyThread");
        }
    }


    private static class MyRun implements Runnable {
        public void run(){
            System.out.println("MyRun");
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRun()).start();

        new Thread(()->{
            System.out.println("Hello Lambda");
        }).start();



    }
}
