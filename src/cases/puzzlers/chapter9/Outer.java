package cases.puzzlers.chapter9;

import java.lang.reflect.Constructor;

public class Outer {
    public static void main(String[] args) throws Exception {
        new Outer().greetWorld();
    }

    private void greetWorld() throws Exception {
       System.out.println(Inner.class.newInstance());//�����ڲ��࣬��Ҫ��Χʵ��
    	//Constructor<Inner> c = Inner.class.getConstructor(Outer.class);
    	//System.out.println(c.newInstance(Outer.this));
    }

    public static class Inner {
        public String toString() {
            return "Hello world";
        }
    }
}
