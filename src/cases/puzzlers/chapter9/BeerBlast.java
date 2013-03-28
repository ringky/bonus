package cases.puzzlers.chapter9;

import java.io.IOException;
import java.io.InputStream;
/**
 * 需要配置环境变量
 * 这样运行D:\java\workspace\bonus\build>java cases.puzzlers.chapter9.BeerBlast
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
			while(br.readLine()!=null);//读
*/			int exitValue = process.waitFor();
			System.out.println("exit value = " + exitValue);
			System.out.println("exit value = " + process.exitValue());
		}
	}

	//排空子线程的输入流 （如何查看本地平台的缓冲区大小 默认8k 8192字节）
	static void drainInBackground(final InputStream is){
    	new Thread(new Runnable(){
    		public void run(){
    			try {
    				System.out.println(is.read());
    				//if(is.available() >0);
    				while (is.read() >= 0);//死锁的原因是子线程的输出流或输入流缓存太小，所以必须自己手动清空缓存.这句是如何清空缓存的？只要有数据就输出？
    				System.out.println("after fulsh "+is.read());
    				/*{
    					System.out.println("我在输出呢，别急啊！");
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
