package cases.puzzlers.chapter8.hack;

import cases.puzzlers.chapter8.click.CodeTalk;

/**
 * һ�����ڵ�˽�з����ǲ��ܱ�������ķ���ֱ�Ӹ��ǵ�
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
