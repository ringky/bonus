package cases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
public class URLReader {
   public static void main(String[] args)throws Exception
    {
        URL url=new URL("http://www.baidu.com");
        File writeFile=new File("d:\\baidu.html");
        BufferedReader in =new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter out=new BufferedWriter(new FileWriter(writeFile));
        String inputLine=null;
        while((inputLine=in.readLine())!=null)
        {
           out.write(inputLine);
        }
        out.flush();
        in.close();
        out.close();
    }
}

