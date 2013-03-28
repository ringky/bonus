package cases.puzzlers.chapter8;

public class Conundrum {
	public static void main(String[] args) {
		Enigma e = new Enigma();
		System.out.println(e.equals(e));
	}

}

final class Enigma {
	// Provide a class body that makes Conundrum print false.
	// Do *not* override equals.
	/*
	 * public Enigma(){ System.out.println(false); System.exit(0); }
	 */

	public boolean equals(Enigma e) {
		return false;
	}

}
