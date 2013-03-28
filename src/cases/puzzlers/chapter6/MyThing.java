package cases.puzzlers.chapter6;

public class MyThing extends Thing {
    @SuppressWarnings("unused")
	private final  int arg;

    /*
     * This constructor is illegal. Rewrite it so that it has the same
     * effect but is legal.
     */
    public MyThing() {
        this((int)System.currentTimeMillis());
    }
        public MyThing(int i){ //继承类没有隐式的构造器，必须显示的定义一个构造器。构造子类前，必须先构造父类
    	super(i);
    	arg=i;
    }
}
//也可以不继承父类，则super(i)方法可以不用。