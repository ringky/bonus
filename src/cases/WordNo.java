package cases;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.StringTokenizer;

class WordNo {
	public static void main(String[] args) {
		FileReader fin = null;
		LineNumberReader line = null;
		int wordNum = 0;
		try {
			fin = new FileReader("D:\\12.txt");
			line = new LineNumberReader(fin);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		while (true) {
			try {
				String temp = line.readLine();
				wordNum += CountWord(temp);
			} catch (Exception e) {
				break;
			}
		}
		try {
			fin.close();
		} catch (Exception e) {
		}
		;
		System.out.println("Word count is:" + wordNum);
	}
	
/*public static int CountWord(String str) {
		StringTokenizer token = new StringTokenizer(str);
		return token.countTokens();
	}*/
	
	public static int CountWord(String str) {
		String[] words = str.split("\\s");
		return words.length;
	}
}
