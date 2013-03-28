package cases.puzzlers.chapter2;
/**
 * @PrintStream.print(char);
 * @PrintStream.print(int);
 */
public class DosEquis {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        //char i = 0;
        System.out.print(true  ? x : 0);
        System.out.print(false ? i : x); 
    }
}
/**
 * 1.如果第二个和第三个操作数具有相同的类型，那么它就是条件表达式的类型。
 * 2.如果一个操作数的类型是T，T表示byte,short或char,而另外一个操作数是int类型的常量表达式
 * 	 ，它的值可以用类型T表示，那么条件表达式的类型就是T。
 * 3.否则，将对操作数类型进行二进制数字提升，而条件表达式的类型就是第二个和第三个操作数被提升
 * 	 之后的类型。
 */


