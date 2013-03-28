package cases;
public class StringSpiltByByte {

	/*
	 * 汉字机内码在计算机的表达方式的描述是，使用二个字节，每个字节最高位一位为1。 计算机中， 补码第一位是符号位， 1 表示为 负数， 所以
	 * 汉字机内码的每个字节表示的十进制数都是负数
	 */

	private String subString(String str, int len) {

		byte[] b = str.getBytes();

		if (len == 1) { // 当只取1位时
			if (b[0] < 0) // 汉字的每个字节都<0
				return new String(b, 0, 0);
			else
				return new String(b, 0, 1);
		} else {
			if (b[len - 1] < 0 && b[len - 2] > 0) { // 判断最后一个字节是否为一个汉字的第一个字节

				return new String(b, 0, len - 1);
			}
		}
		return new String(b, 0, len);
	}

	public static void main(String[] args) {
		System.out.println("default charset is :"
				+ java.nio.charset.Charset.defaultCharset());
		String str = "我ABC汉DEF";
		System.out.println(str.getBytes()[0]);
		System.out.println(str.getBytes()[1]);
		System.out.println(str.getBytes()[2]);
		System.out.println(new StringSpiltByByte().subString(str, 6));

		char c = '我';
		int i = c;
		System.out.println(c);
		System.out.println(i);

	}
}
