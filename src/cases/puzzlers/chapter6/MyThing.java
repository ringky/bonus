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
        public MyThing(int i){ //�̳���û����ʽ�Ĺ�������������ʾ�Ķ���һ������������������ǰ�������ȹ��츸��
    	super(i);
    	arg=i;
    }
}
//Ҳ���Բ��̳и��࣬��super(i)�������Բ��á�