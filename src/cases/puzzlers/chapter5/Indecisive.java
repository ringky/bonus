package cases.puzzlers.chapter5;

public class Indecisive { 
    public static void main(String[] args) {
        System.out.println(decision());
    }



	@SuppressWarnings("finally")
	static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    } 
}
