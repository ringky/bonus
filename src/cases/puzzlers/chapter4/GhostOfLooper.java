package cases.puzzlers.chapter4;
public class GhostOfLooper {
    public static void main(String[] args) {
        // Place your declaration for i here
    	short i = -1;
        while (i != 0){
            i >>>= 1;
            System.out.println("i>>>=1");
        }
    }
}
//ִ����λ�������Ȱ�i����Ϊint�����ؿ�������ͣ�