package cases;

import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;

public class getNum  {
	public getNum() {
		System.out.println("getNum Create");
	}

	public static double get45(double a, int b) {//����bλ��С������������
		return Math.round(a * Math.pow(10, b)) / Math.pow(10, b);
		//Math.floor(a)�ذ壬����ȡ��
		//Math.ceil(a)�컨�壬����ȡ��
		//Math.round(a)��������ȡ��
	}
	
	
	public static void main(String[] args) {
		System.out.println(get45(10.16645, 2));
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd E"));
		System.out.println(DateFormatUtils.format(DateUtils.addDays(new Date(), -12),"yyyy-MM-dd E"));
		System.out.println(DateFormatUtils.format(DateUtils.addMonths(new Date(), 3),"yyyy-MM-dd"));
		
	}

}
