package cases;

public class SplitDemo {
	public static String[] ss=new String[20];
	public SplitDemo() {
	 
	     String s = "The rain in Spain falls mainly in the plain.";
	     // 在每个空格字符处进行分解。返回字符串数组
	     ss = s.split(" ",1);  
	}
	public static void main(String[] args) {
	  new SplitDemo();
	  for(int i=0;i<ss.length;i++)
	  System.out.println(ss[i]);
	}

	} 