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
			 ������һ��α����������Ǵ�������������������о��ȷֲ��� int ֵ��
			 int nextInt(int n) 
			 ����һ��α����������ǴӴ��������������������ȡ���ġ��� 0����������ָ��ֵ����������֮����ȷֲ��� intֵ��
*/
		}
		
		System.out.print( sdf.format(new Date()).substring(0, 4) + random);
	}

}