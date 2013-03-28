package cases.puzzlers.chapter9;

public class Greeter {
    public static void main (String[] args) {
        String greeting = "Hello world";
        for (int i = 0; i < greeting.length(); i++)
            System.out.write(greeting.charAt(i));//write方法不会自动刷新缓冲区
        	//System.out.flush();
    }
}
