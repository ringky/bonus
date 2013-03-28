package cases.puzzlers.chapter7;

public class Mod {
    public static void main(String[] args) {
        final int MODULUS = 3;
        int[] histogram = new int[MODULUS];

        // Iterate over all ints (Idiom from Puzzle 25)
        int i = Integer.MIN_VALUE;
        do {
            histogram[mod(i,MODULUS)]++;
        } while (i++ != Integer.MAX_VALUE);

        for (int j = 0; j < MODULUS; j++)
            System.out.println(histogram[j] + " ");
    } 
    
    private static int mod(int i,int modules){
    	int result = i % modules ;
    	return result < 0?result + modules:result;
    	
    }
}
