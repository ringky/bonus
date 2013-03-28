package cases.puzzlers.chapter3;

public class StringCheese {
    public static void main(String args[]) {
        byte bytes[] = new byte[256];    
        for(int i = 0; i < 256; i++)
            bytes[i] = (byte)i;
        String str = new String(bytes); //用默认字符集
       // String str = new String(bytes,"ISO-8859-1"); //指定字符集
        System.out.println("Default charset is :" + java.nio.charset.Charset.defaultCharset());
        for(int i = 0, n = str.length(); i < n; i++){
            System.out.print((int)str.charAt(i) + " ");
        }
    }
}
//ACSII字符是所有字符集的最小公共子集。他只有128个 0~127