package cases.puzzlers.chapter10;


public class Outer {
	/*static*/  class Inner1 extends Outer {}
	  class Inner2 extends Inner1 {
		  public Inner2(){
			Outer.this.super();
		  }
		  
	  }
}
//内部类Inner2要实例化必须提供一个其超类的实例Inner2。而inner2实例化又需要其超类的实例
//Outer。所以在Outer构造器调用前是不能调用inner的实例的。如果把inner1申明为static的话
//则可以解决问题，static类型的不必等到类实例化后的。