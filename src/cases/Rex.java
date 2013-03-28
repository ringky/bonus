package cases;

public class Rex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		String sName = "Java转义字符(补遗)";  
		//sName = sName.replaceFirst("(补遗)","");  
		sName = sName.replaceFirst("\\(补遗\\)","");  //正则表达式(补遗)匹配的是字符串"补遗",而不是字符串"(补遗)"
		System.out.println(sName);  */

		//正数  （）表示一个整体匹配
		String reg = "^[1-9]\\d{0,18}(\\.\\d{0,2})?$";
		
		String a = "62044444444.66";
		
		System.out.println(a.matches(reg));
		
	}

}
