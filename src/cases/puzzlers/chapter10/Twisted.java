package cases.puzzlers.chapter10;

public class Twisted {
    private final String name;
    Twisted(String name) {
        this.name = name;
    }
    private String name() {
        return name;
    }
    private void reproduce() {
        new Twisted("reproduce") {
            void printName() {
                System.out.println(name());//private方法不能被继承。
            }
        }.printName();
    }
    public static void main(String[] args) {
        new Twisted("main").reproduce();
    }
}
