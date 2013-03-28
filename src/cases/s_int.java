package cases;

import java.math.BigDecimal;

public class s_int {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

/*		String str = "123456";
		int[] a = new int[1024];
		for (int i = 0; i < str.length(); i++) {
			a[i] = (int)str.charAt(i)- 48;//0µÄASCIIÖµ
			System.out.println(str.charAt(i));
		}
		for(int j=0;j<str.length();j++){
			System.out.println(a[j]);
		}*/

		System.out.println( new BigDecimal("100").divide(new BigDecimal("3"), 2, BigDecimal.ROUND_CEILING));
		/*
		int a = 5;
		int b = 2;
		
		System.out.println(a/b);*/
	}

}
