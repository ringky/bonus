package cases;

import java.text.SimpleDateFormat;
import java.util.Date;


public class RandomTest {
	public static void main(String[] args) {
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		java.util.Random r=new java.util.Random(); 
		String random="";
		for(int i=0;i<10;i++){ 
			 random =random+String.valueOf( r.nextInt(9));/*int nextInt() 
			 返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
			 int nextInt(int n) 
			 返回一个伪随机数，它是从此随机数生成器的序列中取出的、在 0（包括）和指定值（不包括）之间均匀分布的 int值。
*/
		}
		
		System.out.print( sdf.format(new Date()).substring(0, 4) + random);
	}

}