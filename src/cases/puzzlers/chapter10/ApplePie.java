package cases.puzzlers.chapter10;

public class ApplePie {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) ;{//����ֺ�
            count++;
        }
        System.out.println(count);
    }
}

//chapter4
 class Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++){
            j = j++;//j++��ֵ����j��ִ����������֮ǰ�ĳ�ʼֵ�����пɸ�Ϊj++
        }
        System.out.println(j);
    }
}