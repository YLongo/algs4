package main.java.chapter02;

import java.util.Arrays;

/**
 * @author YLongo
 * @since 2021-02-01 14:26
 */
public class Shell {

	public static void main(String[] args) {
		int[] a = {2, 1, 8, 4, 0};
		
		shellSort(a);
		
		System.out.println(Arrays.toString(a));
	}


	/**
	 * @see <a href="https://www.bilibili.com/video/BV1JW411i731?p=107">希尔排序</a>
	 */
	public static void shellSort(int[] arr) {
		
		int N = arr.length;

		for (int i = N / 2; i < N; N /= 2) {

			for (int j = i; j < N; j++) {
				
				int temp = arr[j];
				int k = j;
				
				while (k >= i && arr[k - i] > temp) {
					arr[k] = arr[k - i];
					k -= i;
				}
				
				arr[k] = temp;
			}
		}
	}

}
