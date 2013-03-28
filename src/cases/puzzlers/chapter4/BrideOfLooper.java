package cases.puzzlers.chapter4;

public class BrideOfLooper {
    public static void main(String[] args) {
        // Place your declaration for i here
    	double i = Double.NaN;
    	//float j = Float.NaN;
        while (i != i) { 
        	System.out.println("double.NaN");
        }
    }
}
