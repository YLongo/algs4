package main.java.chapter02;

import java.util.Arrays;

/**
 * @author YLongo
 * @since 2021-02-01 11:13
 */
public class Exercise {

	public static void main(String[] args) {
		int[] a = {2, 1, 8, 4, 0};
		sort(a);

		System.out.println(Arrays.toString(a));
	}
	
	/**
	 * 1. 冒泡排序 <br>
	 * 2. 选择排序 <br>
	 * 3. 插入排序 <br>
	 * 4. 希尔排序 <br>
	 * 5. 归并排序-递归 <br>
	 * 6. 归并排序-非递归 <br>
	 * 7. 快速排序
	 */
	public static void sort(int[] arr) {
		
		int N = arr.length;
			
		
	}
	
	
	
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
