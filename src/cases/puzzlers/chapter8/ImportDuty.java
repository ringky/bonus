package cases.puzzlers.chapter8;

import java.util.Arrays;

class ImportDuty {
    public static void main(String[] args) {
        printArgs(1, 2, 3, 4, 5);
    }

    static void printArgs(Object... args) {
        System.out.println(Arrays.toString(args));
    }
}
