package cases.puzzlers.chapter5;

public class Reluctant {
    @SuppressWarnings("unused")
	private Reluctant internalInstance = new Reluctant();

    public Reluctant() throws Exception {
        throw new Exception("I'm not coming out");
    }

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        try {
            Reluctant b = new Reluctant();
            System.out.println("Surprise!");
        }
       /* catch (Error ex) { //stackOverFlowError
            System.out.println("I told you so");
        }*/ catch (Exception e) {
			e.printStackTrace();
		}
    }
}
