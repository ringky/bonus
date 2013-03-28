package cases.puzzlers.chapter8;

import java.util.Random;


/*
 * 在1.4中，? ： 条件操作符，当第二个和第三个参数是引用类型时，一个参数必须是另一个类型的子类型。
 * 
 */
public class CoinSide {
	private static Random rnd = new Random();

	public static void main(String[] args) {
		System.out.println(flip());
	}

	public static CoinSide flip() {
		return rnd.nextBoolean() ? Heads.INSTANCE :  Tails.INSTANCE;
	}

}

class Heads extends CoinSide {
	private Heads() {
	}

	public static final Heads INSTANCE = new Heads();

	public String toString() {
		return "heads";
	}
}

class Tails extends CoinSide {
	private Tails() {
	}

	public static final Tails INSTANCE = new Tails();

	public String toString() {
		return "tails";
	}
}
