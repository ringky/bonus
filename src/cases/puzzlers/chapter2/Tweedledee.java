package cases.puzzlers.chapter2;

public class Tweedledee {
    public static void main(String[] args) {
        // Put your declarations for x and i here
    	Object x="Hello";
    	String  i=" World!";
        x = x + i;  // Must be LEGAL
       // x += i;     // Must be ILLEGAL
        //���ϲ�����Ҫ���������������ǻ������ͣ���int,���ǰ�װ�˵Ļ���������Integer��
    }
}
