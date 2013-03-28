package cases.puzzlers.chapter3;

public class Me {
	public static void main(String[] args) {
		System.out.println(Me.class.getName().replaceAll(".", "/") + ".class");
		System.out.println(Me.class.getName().replaceAll("\\.", "/") + ".class");
		System.out.println(Me.class.getName());
	}
}
/*
 * 反斜杠\他标识转义字符序列的开始。
 * 正则表达式中点（.）匹配任意字符。 所以在正则表达式中匹配点要用\\.表示。
 */
