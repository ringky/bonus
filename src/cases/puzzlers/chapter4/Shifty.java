package cases.puzzlers.chapter4;

public class Shifty {
    public static void main(String[] args) {
        int i = 0;
        for (int val = -1 ; val != 0; val <<= 1){
            i++;
        }
        System.out.println(i);
    }
}
