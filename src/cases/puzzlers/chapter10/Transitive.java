package cases.puzzlers.chapter10;

public class Transitive {
    public static void main(String[] args) throws Exception {
        /*
         * If you can come up with a set of primitive types and values
         * that causes this program to print "true true false", then
         * you have proven that the == operator is not transitive.
         */
      //  <typeX> x = <valueX>;
    //  <typeY> y = <valueY>;
      //  <typeZ> z = <valueZ>;
        long x = Long.MAX_VALUE;
        double y = (double)Long.MAX_VALUE;  //long型转double会导致精度缺失
        long z = Long.MAX_VALUE - 1;

        System.out.print ((x == y) + " ");
        System.out.print ((y == z) + " ");
        System.out.println(x == z);
    }
}
