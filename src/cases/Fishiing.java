package cases;

public class Fishiing {

	/** ���¹���������
	 * abcde���˴��棬����˯����a���������ӵ�1���㣬��ʣ�µķֳ�5�֣���һ�����ˣ�
	 *  b��������Ҳ�ӵ�1������ʣ�µķֳ�5�ݣ���һ�����ˣ� 
	 *  Ȼ��cde��������ķ���ȡ�㡣
	 *   ������һ�����˶������㣬д������㷨
	 */
	public static void main(String[] args) {
		// �ֱ𱣴�a��e��ȡ��������Ϊ�˷��㣬�������ӵ����㣩

		int[] everybody_fish = new int[5];

		// ��ʱ���飬���浱ǰ������1���5��������ֻ�ж�Ϊ0������������

		int[] temp = new int[5];

		// ��1ɨ�赽10000

		for (int x = 1; x <= 10000; x++)

		{

			// ��ǰ�ѱ�ȡ�߶����㣨�������ӵ��㣩

			int sum = 0;

			int i = 0;

			// ����abcde����ȡ����

			for (i = 0; i < everybody_fish.length; i++)

			{

				temp[i] = (x - 1 - sum) % everybody_fish.length;

				// ֻҪ��һ���˲���ƽ������ʣ����㣬�Ͳ���������

			if (temp[i] != 0)

					break;

				everybody_fish[i] = (x - 1 - sum) / everybody_fish.length + 1;  

				sum += everybody_fish[i];

			}

			// forѭ���������������������������Ӧ��ֵ��

			if (i == everybody_fish.length)

			{

				System.out.print("������" + x + "����     ");

				for (i = 0; i < everybody_fish.length; i++)

				{

					System.out.print((char) ('a' + i) + ":"

					+ (everybody_fish[i] - 1) + "   ");

				}

				System.out.print("���ʣ��" + (x - sum) + "����      ");

				System.out.println("����" + everybody_fish.length + "����");

			}

		}

	}

}
