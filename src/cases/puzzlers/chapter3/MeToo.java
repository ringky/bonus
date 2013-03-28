package cases.puzzlers.chapter3;

import java.io.File;
import java.util.regex.Matcher;

public class MeToo {
	public static void main(String[] args) {
		//System.out.println(MeToo.class.getName().replaceAll("\\.", File.separator) + ".class");
		System.out.println(MeToo.class.getName().replaceAll("\\.", Matcher.quoteReplacement(File.separator)) + ".class");
		System.out.println(MeToo.class.getName().replace(".", File.separator) + ".class");
		//File.separator ×ªÒå×Ö·û
	}
}
