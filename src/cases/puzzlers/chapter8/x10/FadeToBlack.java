package cases.puzzlers.chapter8.x10;
/**
 * ������Java SE 1.5�������ԣ����͵ı����ǲ��������ͣ�
 * Ҳ����˵���������������ͱ�ָ��Ϊһ��������
 * ���ֲ������Ϳ��������ࡢ�ӿںͷ����Ĵ����У��ֱ��Ϊ�����ࡢ���ͽӿڡ����ͷ�����
 *  Java�������뷺�͵ĺô��ǰ�ȫ�򵥡�
 * 
 *
 */
public class FadeToBlack {
    // This method should read and print the value of the field Z in class X.Y
    static class Xy extends X.Y {}
	//���ͱ������� ����
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
