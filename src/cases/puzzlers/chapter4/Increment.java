package cases.puzzlers.chapter4;
public class Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++){
            j = j++;//j++��ֵ����j��ִ����������֮ǰ�ĳ�ʼֵ�����пɸ�Ϊj++
        }
        System.out.println(j);
    }
}
//j=j++ �ȼ���
//int tmp = j
//j = j + 1
//j = tmp


