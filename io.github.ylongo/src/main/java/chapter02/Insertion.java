package main.java.chapter02;

import main.java.Example;

import java.util.Arrays;

/**
 * @author yihailong
 * @since 2021-01-27 17:41
 */
public class Insertion {

	public static void main(String[] args) {
		
//		Example.show(Example.a);

//		sort(Example.a);
//		
//		Example.show(Example.a);

		int[] a = {2, 1, 8, 4, 0};
		insertSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	/**
	 * 升序排
	 */
	public static void sort(Comparable[] a) {
		
		int N = a.length;

		for (int i = 1; i < N; i++) {

			for (int j = i; j > 0 && Example.less(a[j], a[j - 1]); j--) {
				Example.exch(a, j, j - 1);
			}
		}
	}

	/**
	 * @see <a href="https://www.bilibili.com/video/BV1JW411i731?p=105">插入排序</a>
	 */
	public static void insertSort(int[] arr) {

		int N = arr.length;
		
		for (int i = 1; i < N; i++) {
			
			int temp = arr[i];
			int j = i;
			
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			
			arr[j] = temp;
		}
	}
}
