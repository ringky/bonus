package cases.puzzlers.chapter10;

public class Symmetric {
    public static void main(String[] args) throws Exception {
        /*
         * If you can come up with a set of primitive types and values
         * that causes this program to print "true false", then
         * you have proven that the == operator is not symmetric.
         */
    	//�Է������ݡ��Գ���
        <typeX> x = <valueX>;
        <typeY> y = <valueY>;

        //java���������ǶԳƵġ������޽⡣
       
        System.out.print ((x == y) + " ");
        System.out.println(y == x);
    }
} 
