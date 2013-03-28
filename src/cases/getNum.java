package cases;

import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;

public class getNum  {
	public getNum() {
		System.out.println("getNum Create");
	}

	public static double get45(double a, int b) {//保留b位的小数，四舍五入
		return Math.round(a * Math.pow(10, b)) / Math.pow(10, b);
		//Math.floor(a)地板，向下取整
		//Math.ceil(a)天花板，向上取整
		//Math.round(a)四舍五入取整
	}
	
	
	public static void main(String[] args) {
		System.out.println(get45(10.16645, 2));
		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd E"));
		System.out.println(DateFormatUtils.format(DateUtils.addDays(new Date(), -12),"yyyy-MM-dd E"));
		System.out.println(DateFormatUtils.format(DateUtils.addMonths(new Date(), 3),"yyyy-MM-dd"));
		
	}

}
