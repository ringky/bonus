package cases.puzzlers.chapter2;

public class Oddity {
  /*  public static boolean isOdd(int i) {
        return i % 2 == 1;
    }*/

	  public static boolean isOdd(int i) {
	        return (i & 1) != 0;
	    }
    public static void main(String[] args) {
    	System.out.println(isOdd(5));
    }
}
