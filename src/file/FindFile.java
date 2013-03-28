package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindFile {

	/**
	 * @author LI,GEN
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		while(true){
		System.out.println("请输入文件夹的名称：");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String inputData = input.readLine();

		
		File dir = new File(inputData);
		
		System.out.println(inputData);

		File[] files = dir.listFiles();
		dir.isDirectory();//是否为目录

	
		try {
			System.out.println("文件个数为"+files.length);
			
			System.out.println("before sort: ");
			for (int i = 0; i < files.length; i++){
				files[i].isDirectory();
				System.out.println(files[i].getName() + " ");
			}
				
			
			System.out.println();
			Arrays.sort(files);//按名字排序
			System.out.println("sort by name: ");
			for (int i = 0; i < files.length; i++)
				System.out.println(files[i].getName() + " ");
			    System.out.println();
		} catch (NullPointerException e) {
			System.out.println("目录不存在");
			e.printStackTrace();
		}
	}
	}
}
