package cases.puzzlers.chapter9;


/**
 * 主线程会等待后台进程结束才完成初始化
 * 后台进程会等待类初始化完成后才将initialized设置为true.
 * 这将造成死锁。
 * 
 *
 */
public class Lazy {
    private static boolean initialized = false;
    public static  Thread t = new Thread(new Runnable() {
        public void run() {
            initialized = true;
        }
    });
    static {
 
        t.start();
/*        try {
            t.join();//主线程等待后台线程结束
        } catch(InterruptedException e) {
            throw new AssertionError(e);
        }*/
    }

    public static void main(String[] args) {
        try {
            t.join();//主线程等待后台线程结束
        } catch(InterruptedException e) {
            throw new AssertionError(e);
        }
        System.out.println(initialized);
    }
}
