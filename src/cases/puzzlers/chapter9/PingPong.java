package cases.puzzlers.chapter9;

public class PingPong {
    public static synchronized void main(String[] a) {
        Thread t = new Thread() {
            public void run() { pong(); }
        };
        t.run();//调用后台进程的run()方法，后台进程没有启动，启动要通过start()方法。
        System.out.print("Ping");
    }

    static synchronized void pong() {
        System.out.print("Pong");
    }
}
