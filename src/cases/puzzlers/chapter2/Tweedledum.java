package cases.puzzlers.chapter2;

public class Tweedledum {
    public static void main(String[] args) {
        // Put your declarations for x and i here
    	short x=0;
    	int i=123456;
      System.out.println( x += i);     // Must be LEGAL 复合操作符包含隐式转换。
      //  x = x + i;  // Must be ILLEGAL
    }
}
