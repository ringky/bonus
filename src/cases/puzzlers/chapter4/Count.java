package cases.puzzlers.chapter4;

public class Count {
    public static void main(String[] args) {
        final int START = 2000000000;
        int count = 0;
        for (float f = START; f < START + 50; f++){
            count++;
        }
        System.out.println(count);
    }
}
//float�ľ���Ϊ24λ��
//int 2000000000 ������31λ��
//50 ������  32+ 16 +2  110010 ��λ������
//2000000000 �� 2000000050��float��ʾ����ͬ�ġ�

//int 2^31-1 = 2147483647