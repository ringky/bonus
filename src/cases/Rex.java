package cases;

public class Rex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		String sName = "Javaת���ַ�(����)";  
		//sName = sName.replaceFirst("(����)","");  
		sName = sName.replaceFirst("\\(����\\)","");  //������ʽ(����)ƥ������ַ���"����",�������ַ���"(����)"
		System.out.println(sName);  */

		//����  ������ʾһ������ƥ��
		String reg = "^[1-9]\\d{0,18}(\\.\\d{0,2})?$";
		
		String a = "62044444444.66";
		
		System.out.println(a.matches(reg));
		
	}

}
