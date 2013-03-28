package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFileWithRecursion {

	/**
	 * @author LI,GEN
	 * @throws IOException
	 * @递归列出所有文件夹下的文件
	 */
	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("请输入文件夹的名称：");
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String inputData = input.readLine();

			File dir = new File(inputData);

			// System.out.println(inputData);

						dir.isDirectory();// 是否为目录

			try {
				getFilesByContent(dir.toString(),dir.toString());
			} catch (NullPointerException e) {
				System.out.println("目录不存在");
				e.printStackTrace();
			}
		}
	}
	
/**
 * 
 * @param path 上级目录
 * @param root  根目录
 */
	private static void getFilesByContent(String path,String root) {

		// File[] files = null;
		File dir = new File(path);

		// System.out.println(dir.listFiles());
		File[] subFiles = dir.listFiles();
		
	
		// System.out.println("length" + subFiles.length);
		for (int i = 0; i < subFiles.length; i++) {
			if (subFiles[i].isDirectory()) {
				System.out.println( "..." + subFiles[i]);
				getFilesByContent(subFiles[i].toString(),root);
			}else if(subFiles[i].getParent().equals(root) && subFiles[i].isFile()){
				System.out.println("." + subFiles[i]);
			}else{
				System.out.println("|--" + subFiles[i]);
			}

		}
		
	}
}
