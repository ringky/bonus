package cases.puzzlers.chapter3;

import java.util.*;

public class Rhymes {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        StringBuffer word = null;
        switch(rnd.nextInt(2)) {
            case 1:  word = new StringBuffer('P');//int 80
            case 2:  word = new StringBuffer('G');//int 71
            default: word = new StringBuffer('M');//int 77
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }
}
