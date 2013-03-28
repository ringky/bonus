package cases;

import java.io.IOException;
import java.util.Properties;

public class PropertyMgr {
	private static  Properties props = new Properties();
	
	static {
		try {
			props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("jdbc.properties"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	//private PropertyMgr() {}; static 方法不需要构造方法。
	
	public static synchronized String getProperty(String key) {
		
		//Thread th = new Thread();
		/*Lock lock = new ReentrantLock();
		lock.lock();
		//
		lock.unlock();*/
		
		return props.getProperty(key);
	}
	
	public static void main(String[] args){
		String projectName = PropertyMgr.getProperty("project");
		System.out.println(projectName);
	}
}
