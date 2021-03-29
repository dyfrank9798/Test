package xiancheng.Thread;

/**
 * @author zhangrongchuan
 * @data 2020-12-2020/12/7-17:03
 * @Description
 */
public class ThreadDemo10Volatile {
    //1单例的饿汉模式 //3所以需要使用到Volatile
    private  static  volatile ThreadDemo10Volatile INSTANCE;
    private ThreadDemo10Volatile(){

    }

    public static  ThreadDemo10Volatile getINSTANCE(){
        //2单例的双否定验证
        if(INSTANCE == null){
            synchronized (ThreadDemo10Volatile.class){
                if(INSTANCE == null){
                    try{
                        Thread.sleep(1);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    /**{
                     * JVM的调用
                     * 1.申请内存 会有一个默认值(假如=0)
                     * 2.设置成我们给的初始值(加入 = 8)
                     * 3.把这个变量(初始值)赋值给INSTANCE （指向地址）
                     *
                     * 如果这个123步骤中间出现指令重排序
                     * 如果1步骤执行完毕，执行3，此时INSTANCE=0 。第二个线程在判断INSTANCE
                     * 是否为null的时候就会出现错误
                     *
                     * 需要假如volatile禁止指令重排序
                     *
                     */
                    INSTANCE = new ThreadDemo10Volatile();
                }
            }
        }

        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {

    }
}
