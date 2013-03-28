package cases.sorts;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 63, 4, 24, 1, 3, 15 };
		BubbleSort sorter = new BubbleSort();
		sorter.sort(array);

		System.out.println("array :" + Arrays.toString(array));
	}

	public void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
}