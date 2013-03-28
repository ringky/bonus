package cases.puzzlers.chapter5;


public class Arcane2 {
    public static void main(String[] args) {
        try {
            // If you have nothing nice to say, say nothing
        } catch(Throwable e) {
        	e.printStackTrace();
            System.out.println("This can't happen");
        }
    }
}
