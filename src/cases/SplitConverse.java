package cases;

public class SplitConverse {
	/**
	 * @param args author Li,Gen
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "209.242.1.1";

		String[] names = value.split("\\.");// 必须使用\\进行转义
        
		String[] addrs = value.split(".");
		System.out.print("names:");
		for (int i = 0, n = names.length; i < n; i++)
		{
			System.out.print(names[i] + "  ");
		}
		for (int j = 0, m = addrs.length; j < m; j++)//什么也不输出
		{
			System.out.print("输出结果" + names[j] + "  ");
		}
	}

}
