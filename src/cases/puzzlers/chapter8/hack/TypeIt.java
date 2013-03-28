package cases.puzzlers.chapter8.hack;

import cases.puzzlers.chapter8.click.CodeTalk;

/**
 * 一个包内的私有方法是不能被另个包的方法直接覆盖的
 * 
 *
 */
public class TypeIt {
    private static class ClickIt extends CodeTalk {
        void printMessage() {
            System.out.println("Hack");
        }
    }

    public static void main(String[] args) {
        ClickIt clickit = new ClickIt();
        clickit.doIt();
    }
}
