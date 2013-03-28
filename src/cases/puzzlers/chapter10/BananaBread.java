package cases.puzzlers.chapter10;

import java.util.*;
public class BananaBread {
    public static void main(String[] args) {
        Integer[] array = { 3, 1, 4, 1, 5, 9 };
/*        Arrays.sort(array, new Comparator<Integer>() {
        	public int compare(Integer i1, Integer i2) {
        		return i1 < i2 ? -1 : (i2 > i1 ? 1 : 0);
        	}
        });
 */        
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("½µÐò" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("ÉýÐò" + Arrays.toString(array));
    }
}
