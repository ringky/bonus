package cases.search;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {

	/**
	 * 二分查找算法
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int[] ints = { 2, 23, 53, 64, 158, 221, 260, 278, 651, 1564, 2355 ,36};
		Arrays.sort(ints);
		for(int i=0;i<ints.length;i++){
			System.out.println(ints[i]);
		}
		while (true) {
			System.out.println("请输入数据：");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			try {
				int a = new Integer(in.readLine()).intValue();
				if (find(ints, a) == -1) {
					System.out.println("ints数组不存在该数");
					System.out.println("------------------------------------ ");
				} else {
					System.out.println("the position is: " + find(ints, a));
					System.out.println("------------------------------------ ");
				}
			} catch (Exception e) {
				System.out.println("请输入整数");
				System.out.println("------------------------------------ ");
			}
		}
		
	}

	private static int find(int[] ints, int key) {
		int lowerBound = 0;
		int upperBound = ints.length - 1;
		int curIn;
		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (ints[curIn] == key) {
				return curIn+1;
			} else if (lowerBound > upperBound) {
				return -1;
			} else if (ints[curIn] < key) {
				lowerBound = curIn + 1;
			} else {
				upperBound = curIn - 1;
			}
		}
	}
}
