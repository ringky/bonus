package cases.puzzlers.chapter3;

public class Me {
	public static void main(String[] args) {
		System.out.println(Me.class.getName().replaceAll(".", "/") + ".class");
		System.out.println(Me.class.getName().replaceAll("\\.", "/") + ".class");
		System.out.println(Me.class.getName());
	}
}
/*
 * ��б��\����ʶת���ַ����еĿ�ʼ��
 * ������ʽ�е㣨.��ƥ�������ַ��� ������������ʽ��ƥ���Ҫ��\\.��ʾ��
 */
