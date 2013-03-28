package file;

import java.util.HashMap;
import java.util.Map;

public class ExportTest {

	static String filename = "exportFile.csv";

	static Map<String, String> config = new HashMap<String, String>();

	static String sql = "";

	static {

		config.put("RemotePath", PropertyMgr.getProperty("channel2bi"));
		config.put("HostIp", PropertyMgr.getProperty("FTPHostIp"));
		config.put("Port", PropertyMgr.getProperty("FTPPort"));
		config.put("Username", PropertyMgr.getProperty("FTPUsername"));
		config.put("Password", PropertyMgr.getProperty("FTPPassword"));
		config.put("LocalPath", PropertyMgr.getProperty("LocalPath"));
		config.put("separator", PropertyMgr.getProperty("separator"));
		config.put("newLine", PropertyMgr.getProperty("newLine"));

		 sql = "select t.submit_person,t.link_tel,t.remark from dis_shop_info t";

	}

	public static void main(String[] args)  {
		FileDealer fd = new FileDealer();
		try {
			System.out.println(config.get("LocalPath"));
			System.out.println(config.get("separator"));
			System.out.println(config.get("newLine"));
			fd.batchWriteFile(config, filename, sql);
			System.out.println("恭喜您，导出文件成功！");
		} catch (Exception e) {
			System.out.println("导出文件失败！");
			e.printStackTrace();
		}
	}
}
