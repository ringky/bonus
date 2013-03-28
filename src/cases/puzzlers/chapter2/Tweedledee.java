package cases.puzzlers.chapter2;

public class Tweedledee {
    public static void main(String[] args) {
        // Put your declarations for x and i here
    	Object x="Hello";
    	String  i=" World!";
        x = x + i;  // Must be LEGAL
       // x += i;     // Must be ILLEGAL
        //复合操作符要求两个操作数都是基本类型，如int,或是包装了的基本类型如Integer。
    }
}
