package cases.puzzlers.chapter2;

public class Multicast {
    public static void main(String[] args) {
        System.out.println((int) (char) (byte) -1);
      // double i =  Math.pow(2, 16) - 1;
    }
}
//int -> byte -> char - >int
//-1  -> -1 -> Math.pow(2, 16) - 1 ->Math.pow(2, 16) - 1
//    ��������չ���ؿ��������  -> �ؿ�խ���������� byteת��Ϊint,int��ת��Ϊchar ->����չ
//�ӽ�խ�Ļ�������ת��Ϊ�Ͽ�����͵���Ϊ��
//�������������ַ��ŵģ�����з�����չ��������������char���͵ģ��򲻹ܺ����������
//�������Ͷ�ִ������չ��
