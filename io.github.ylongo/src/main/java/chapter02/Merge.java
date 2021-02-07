package main.java.chapter02;

import main.java.Example;

/**
 * @author yihailong
 * @since 2021-01-28 18:21
 */
public class Merge<T> {
	
	private static Comparable[] aux; // 归并所需要的辅助数组

	public static void main(String[] args) {
		System.out.println("排序前");
		Example.show(Example.a);
		
		sort(Example.a);

		System.out.println("排序后");
		Example.show(Example.a);
	}
	
	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];  
		sort(a, 0, a.length - 1);
	}
	
	public static void sort(Comparable[] a, int lo, int hi) {
		
		if (hi <= lo) {
			return;
		}
		
		int mid = lo + (hi - lo) / 2;
		
		sort(a, lo, mid); // 将左半边排序
		sort(a, mid + 1, hi); // 将右半边排序
		merge(a, lo, mid, hi); // 归并结果
	}
	
	public static void merge(Comparable[] a, int lo, int mid, int hi) {
		
		int i = lo;
		int j = mid + 1;
		
		for (int k = 0; k <= hi; k++) {
			aux[k] = a[k];	
		}

		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > hi) {
				a[k] = aux[i++];
			} else if (Example.less(aux[j], aux[i])) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}
}
