package cases.puzzlers.chapter9;


/**
 * ���̻߳�ȴ���̨���̽�������ɳ�ʼ��
 * ��̨���̻�ȴ����ʼ����ɺ�Ž�initialized����Ϊtrue.
 * �⽫���������
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
            t.join();//���̵߳ȴ���̨�߳̽���
        } catch(InterruptedException e) {
            throw new AssertionError(e);
        }*/
    }

    public static void main(String[] args) {
        try {
            t.join();//���̵߳ȴ���̨�߳̽���
        } catch(InterruptedException e) {
            throw new AssertionError(e);
        }
        System.out.println(initialized);
    }
}
