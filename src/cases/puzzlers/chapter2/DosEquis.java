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
 * 1.����ڶ����͵�����������������ͬ�����ͣ���ô�������������ʽ�����͡�
 * 2.���һ����������������T��T��ʾbyte,short��char,������һ����������int���͵ĳ������ʽ
 * 	 ������ֵ����������T��ʾ����ô�������ʽ�����;���T��
 * 3.���򣬽��Բ��������ͽ��ж������������������������ʽ�����;��ǵڶ����͵�����������������
 * 	 ֮������͡�
 */


