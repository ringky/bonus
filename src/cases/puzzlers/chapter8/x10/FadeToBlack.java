package cases.puzzlers.chapter8.x10;
/**
 * 泛型是Java SE 1.5的新特性，泛型的本质是参数化类型，
 * 也就是说所操作的数据类型被指定为一个参数。
 * 这种参数类型可以用在类、接口和方法的创建中，分别称为泛型类、泛型接口、泛型方法。
 *  Java语言引入泛型的好处是安全简单。
 * 
 *
 */
public class FadeToBlack {
    // This method should read and print the value of the field Z in class X.Y
    static class Xy extends X.Y {}
	//类型变量声明 泛型
	public static <T extends X.Y> void main(String[] args){
    	//X x = new X();
		System.out.println("T.Z-" + T.Z);
    	System.out.println("Xy.Z-" + Xy.Z);
    	System.out.println("x.y.z" + X.Y.Z);
    }
}

class X {
    static class Y {
        static String Z = "Black";
    } 

    static C Y = new C();
}

class C {
    String Z = "White";
}
