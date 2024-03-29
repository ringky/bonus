package cases;

public class Fishiing {

	/** 创新工厂面试题
	 * abcde五人打渔，打完睡觉，a先醒来，扔掉1条鱼，把剩下的分成5分，拿一份走了；
	 *  b再醒来，也扔掉1条，把剩下的分成5份，拿一份走了； 
	 *  然后cde都按上面的方法取鱼。
	 *   问他们一共打了多少条鱼，写程序和算法
	 */
	public static void main(String[] args) {
		// 分别保存a至e获取的鱼数（为了方便，包括其扔掉的鱼）

		int[] everybody_fish = new int[5];

		// 临时数组，保存当前鱼数减1后除5的余数，只有都为0，才满足条件

		int[] temp = new int[5];

		// 从1扫描到10000

		for (int x = 1; x <= 10000; x++)

		{

			// 当前已被取走多少鱼（包括被扔的鱼）

			int sum = 0;

			int i = 0;

			// 计算abcde各获取的鱼

			for (i = 0; i < everybody_fish.length; i++)

			{

				temp[i] = (x - 1 - sum) % everybody_fish.length;

				// 只要有一个人不能平均分配剩余的鱼，就不满足条件

			if (temp[i] != 0)

					break;

				everybody_fish[i] = (x - 1 - sum) / everybody_fish.length + 1;  

				sum += everybody_fish[i];

			}

			// for循环正当结束，满足条件，输出相应的值。

			if (i == everybody_fish.length)

			{

				System.out.print("共钓了" + x + "条鱼     ");

				for (i = 0; i < everybody_fish.length; i++)

				{

					System.out.print((char) ('a' + i) + ":"

					+ (everybody_fish[i] - 1) + "   ");

				}

				System.out.print("最后剩余" + (x - sum) + "条鱼      ");

				System.out.println("扔了" + everybody_fish.length + "条鱼");

			}

		}

	}

}
