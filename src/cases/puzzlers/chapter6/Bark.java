package cases.puzzlers.chapter6;


/**
 * Desc ��̬�����ǲ����Ա����ǵģ�ֻ���Ա����ء�
 * 
 * @author Administrator
 *
 */
class Dog {
    public  void bark() {
        System.out.print("woof ");
    }
}

class Basenji extends Dog {
    public  void bark() { }
}

public class Bark {
	public static void main(String args[]) {
        Dog woofer = new Dog();
        Dog nipper = new Basenji();
        woofer.bark();
        nipper.bark();
    }
}
