package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * 
 * @author LI,GEN
 * @function ���ļ�  FileInputStream fileInputStream = new FileInputStream(URL);
 * ��Ҫ�������Ļ��ʾ
 * 
 * �෴����Ӽ�������
 */


class FileInputDemo {
	public static void main(String args[]) {
	
		try {
			// Open the file that is the first command line parameter
			String url = "C://TZH.txt";
			FileInputStream fstream = new FileInputStream(url);
			// Convert our input stream to a DataInputStream
			BufferedReader bin = new BufferedReader(new InputStreamReader(fstream));
			// Continue to read lines while there are still some left to read
			String line = bin.readLine();// ��һ�У�
			// Print file line to screen
			System.out.println(line);
			bin.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();// ��ȡ�ļ��쳣 ���Զ����쳣
		}
	}
	
}
