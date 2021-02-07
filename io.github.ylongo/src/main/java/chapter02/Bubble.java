package main.java.chapter02;

import java.util.Arrays;

/**
 * @author YLongo
 * @since 2021-02-01 14:46
 */
public class Bubble {

	public static void main(String[] args) {

		int[] a = {2, 1, 8, 4, 0};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}

	/**
	 * @see <a href="https://www.bilibili.com/video/BV1JW411i731?p=104">冒泡排序</a>
	 */
	public static void bubbleSort(int[] arr) {
		
		int N = arr.length;

		for (int i = N - 1; i > 0; i--) {

			int flag = 0;
			
			for (int j = 0; j < i; j++) {
				
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			
			if (flag == 0) {
				break;
			}
		}
	}
}
