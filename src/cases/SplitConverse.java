package cases;

public class SplitConverse {
	/**
	 * @param args author Li,Gen
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "209.242.1.1";

		String[] names = value.split("\\.");// ����ʹ��\\����ת��
        
		String[] addrs = value.split(".");
		System.out.print("names:");
		for (int i = 0, n = names.length; i < n; i++)
		{
			System.out.print(names[i] + "  ");
		}
		for (int j = 0, m = addrs.length; j < m; j++)//ʲôҲ�����
		{
			System.out.print("������" + names[j] + "  ");
		}
	}

}
