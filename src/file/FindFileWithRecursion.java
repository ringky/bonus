package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFileWithRecursion {

	/**
	 * @author LI,GEN
	 * @throws IOException
	 * @�ݹ��г������ļ����µ��ļ�
	 */
	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("�������ļ��е����ƣ�");
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String inputData = input.readLine();

			File dir = new File(inputData);

			// System.out.println(inputData);

						dir.isDirectory();// �Ƿ�ΪĿ¼

			try {
				getFilesByContent(dir.toString(),dir.toString());
			} catch (NullPointerException e) {
				System.out.println("Ŀ¼������");
				e.printStackTrace();
			}
		}
	}
	
/**
 * 
 * @param path �ϼ�Ŀ¼
 * @param root  ��Ŀ¼
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
