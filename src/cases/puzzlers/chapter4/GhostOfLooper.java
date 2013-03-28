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
//执行移位操作，先把i提升为int。（拓宽基本类型）