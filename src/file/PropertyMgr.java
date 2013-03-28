package file;

import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author LI,GEN
 *
 */


public class PropertyMgr {
	private static  Properties props = new Properties();
	
	static {
		try {
			props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("jdbc.properties"));
		} catch (IOException e1) {
			System.out.println("jdbc.propertiesÎÄ¼þ¶ÁÈ¡Ê§°Ü£¡");
		}
	}
	
	
	public static  String getProperty(String key) {
		
		/*Thread th = new Thread();
		Lock lock = new ReentrantLock();
		lock.lock();
		//
		lock.unlock();*/
		
		return props.getProperty(key);
	}
	
	public static void main(String[] args){
		String projectName = PropertyMgr.getProperty("project");
		System.out.println(projectName);
		System.out.println(PropertyMgr.getProperty("jdbc.username"));
	}
}
