package cases.puzzlers.chapter10;

public class Reflexive {
    public static void main(String[] args) throws Exception {
        /*
         * If you can come up with a primitive type and value
         * that causes this program to print "false", then
         * you have proven that the == operator is not reflexive.
         */
       // <typeX> x = <valueX>;
    	double x = Double.NaN;
    	float y  = Float.NaN;
    	
    	System.out.println(x == x);
        System.out.println(y == y);
    }
}
