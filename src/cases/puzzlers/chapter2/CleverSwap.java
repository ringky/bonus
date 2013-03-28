package cases.puzzlers.chapter2;

/**
 * 异或运算，两个逻辑变量相异，输出才为1
 * y^x^y = x(没有被证明)
 * 
 */
public class CleverSwap {
    public static void main(String[] args) {
        int x = 1984;
        int y = 2001;
        x ^= y ^= x ^= y;
        System.out.println("x = " + x + "; y = " + y);
    }
}

//the actual behavior of x^=y^=x^=y
//int temp1=x;
//int temp2=y;
//int temp3 = x ^ y;
//x=temp3;
//y = temp2 ^ temp3;
//x = tem1 ^ y;