package cases.puzzlers.chapter3;

public class StringCheese {
    public static void main(String args[]) {
        byte bytes[] = new byte[256];    
        for(int i = 0; i < 256; i++)
            bytes[i] = (byte)i;
        String str = new String(bytes); //��Ĭ���ַ���
       // String str = new String(bytes,"ISO-8859-1"); //ָ���ַ���
        System.out.println("Default charset is :" + java.nio.charset.Charset.defaultCharset());
        for(int i = 0, n = str.length(); i < n; i++){
            System.out.print((int)str.charAt(i) + " ");
        }
    }
}
//ACSII�ַ��������ַ�������С�����Ӽ�����ֻ��128�� 0~127