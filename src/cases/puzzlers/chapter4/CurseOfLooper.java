package cases.puzzlers.chapter4;

public class CurseOfLooper {
    public static void main(String[] args) {
        // Place your declarations for i and j here
    	Integer i = new Integer(0);
    	Integer j = new Integer(0);
    	
        while (i <= j && j <= i && i != j) {
        	System.out.println("i=j");
        }
    }
}
