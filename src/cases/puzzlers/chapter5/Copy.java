package cases.puzzlers.chapter5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {
    static void copy(String src, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) > 0)
                out.write(buf, 0, n);
        } finally {
            try {
				if (in != null)
					in.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				if (out != null)
					out.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
        } 
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 2)
            System.out.println("Usage: java Copy <source> <dest>");
        else
            copy(args[0], args[1]);
    }
}
