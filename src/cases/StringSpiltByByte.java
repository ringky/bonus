package cases;
public class StringSpiltByByte {

	/*
	 * ���ֻ������ڼ�����ı�﷽ʽ�������ǣ�ʹ�ö����ֽڣ�ÿ���ֽ����λһλΪ1�� ������У� �����һλ�Ƿ���λ�� 1 ��ʾΪ ������ ����
	 * ���ֻ������ÿ���ֽڱ�ʾ��ʮ���������Ǹ���
	 */

	private String subString(String str, int len) {

		byte[] b = str.getBytes();

		if (len == 1) { // ��ֻȡ1λʱ
			if (b[0] < 0) // ���ֵ�ÿ���ֽڶ�<0
				return new String(b, 0, 0);
			else
				return new String(b, 0, 1);
		} else {
			if (b[len - 1] < 0 && b[len - 2] > 0) { // �ж����һ���ֽ��Ƿ�Ϊһ�����ֵĵ�һ���ֽ�

				return new String(b, 0, len - 1);
			}
		}
		return new String(b, 0, len);
	}

	public static void main(String[] args) {
		System.out.println("default charset is :"
				+ java.nio.charset.Charset.defaultCharset());
		String str = "��ABC��DEF";
		System.out.println(str.getBytes()[0]);
		System.out.println(str.getBytes()[1]);
		System.out.println(str.getBytes()[2]);
		System.out.println(new StringSpiltByByte().subString(str, 6));

		char c = '��';
		int i = c;
		System.out.println(c);
		System.out.println(i);

	}
}
