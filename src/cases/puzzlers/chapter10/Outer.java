package cases.puzzlers.chapter10;


public class Outer {
	/*static*/  class Inner1 extends Outer {}
	  class Inner2 extends Inner1 {
		  public Inner2(){
			Outer.this.super();
		  }
		  
	  }
}
//�ڲ���Inner2Ҫʵ���������ṩһ���䳬���ʵ��Inner2����inner2ʵ��������Ҫ�䳬���ʵ��
//Outer��������Outer����������ǰ�ǲ��ܵ���inner��ʵ���ġ������inner1����Ϊstatic�Ļ�
//����Խ�����⣬static���͵Ĳ��صȵ���ʵ������ġ�