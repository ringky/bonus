package file;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * 
 * 
 * @author LI,GEN
 *
 */


class FileOutputDemo {
	public static void main(String args[]) {

		FileOutputStream out; // declare a file output object
		PrintStream p; // declare a print stream object

		try {
				String url = "C:\\2.doc";
				out = new FileOutputStream(url);
				// Connect print stream to the output stream
				
				//read from input device
				System.out.println("please input data£º");
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String inputData = in.readLine();
				
				p = new PrintStream(out); // create new printStream
				p.println(inputData);
			
				System.out.println("congratulations!save to file successfully!");
				p.close();
				out.close();
			}

		 catch (Exception e) {
			e.printStackTrace();
			
		}
		}
	}

