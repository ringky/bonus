package cases.puzzlers.chapter4;
public class Looper {
    public static void main(String[] args) {
        // Place your declaration for i here

    	double i = Double.POSITIVE_INFINITY;
        while (i == i + 1) { 
        	System.out.println("i=i+1");
        }
    }
}
