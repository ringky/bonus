package cases.puzzlers.chapter7;

import java.util.*;

public class DatingGame {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, Calendar.JANUARY, 31); // Year, Month, Day
        System.out.print(cal.get(Calendar.YEAR) + " ");
        System.out.print(cal.get(Calendar.DAY_OF_MONTH) + " ");
        System.out.println(cal.get(Calendar.DAY_OF_WEEK) + " ");   //calendar 星期日为1，星期1为2,以此类推...

        Date d = cal.getTime();
        System.out.print(d.getDay() + " "); //d.getDay返回的是星期
        System.out.println(d.getDate()); //d.getDate返回的是月份日期
    }
}
