package cases.puzzlers.chapter9;

import java.io.IOException;
import java.io.InputStream;
/**
 * ��Ҫ���û�������
 * ��������D:\java\workspace\bonus\build>java cases.puzzlers.chapter9.BeerBlast
 *
 */
public class BeerBlast {
	static final String COMMAND = "java cases.puzzlers.chapter9.BeerBlast slave";

	public static void main(String[] args) throws Exception {
		if (args.length == 1 && args[0].equals("slave")) {
			for (int i = 99; i > 0; i--) {
				System.out.println(i + " bottles of beer on the wall");
				System.out.println(i + " bottles of beer");
				System.out.println("You take one down, pass it around,");
				System.out.println((i - 1) + " bottles of beer on the wall");
				System.out.println();
			}
		} else {
			// Master
			Process process = Runtime.getRuntime().exec(COMMAND);
			drainInBackground(process.getInputStream());
			/*BufferedReader   br   =  new  BufferedReader(new InputStreamReader(process.getInputStream())); 
			System.out.println(br.readLine());
			while(br.readLine()!=null);//��
*/			int exitValue = process.waitFor();
			System.out.println("exit value = " + exitValue);
			System.out.println("exit value = " + process.exitValue());
		}
	}

	//�ſ����̵߳������� ����β鿴����ƽ̨�Ļ�������С Ĭ��8k 8192�ֽڣ�
	static void drainInBackground(final InputStream is){
    	new Thread(new Runnable(){
    		public void run(){
    			try {
    				System.out.println(is.read());
    				//if(is.available() >0);
    				while (is.read() >= 0);//������ԭ�������̵߳������������������̫С�����Ա����Լ��ֶ���ջ���.����������ջ���ģ�ֻҪ�����ݾ������
    				System.out.println("after fulsh "+is.read());
    				/*{
    					System.out.println("��������أ��𼱰���");
    					new ProcessBuilder().redirectErrorStream(true);
    					System.out.flush();
    				}*/
    			}catch(IOException e){
    				e.printStackTrace();
    			}
    		}
    	}).start();
    }
}
