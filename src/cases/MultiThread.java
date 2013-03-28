package cases;

public class MultiThread {
	
	private static int value;
	
	private static boolean ready;
	


	private static class ReadThread extends Thread{
		public void run(){
			while(!ready){
				Thread.yield();
			}
			System.out.println(value);
		}
	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		new ReadThread().start();
		
		ready = true;
		value = 6688;
		//Thread.currentThread().sleep(5000);

	}
}
