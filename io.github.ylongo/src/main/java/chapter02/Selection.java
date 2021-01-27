package main.java.chapter02;

import main.java.Example;

/**
 * @author yihailong
 * @since 2021-01-27 17:05
 */
public class Selection {


	public static void main(String[] args) {
		
		sort(Example.a);
		
		Example.show(Example.a);
	}

	/**
	 * 升序排
	 */
	public static void sort(Comparable[] a) {
		
		int N = a.length;

		for (int i = 0; i < N; i++) {
			
			int min = i; // 最小元素的索引

			for (int j = i + 1; j < N; j++) {
				if (Example.less(a[j], a[min])) {
					min = j; // 
				}
			}
			
			Example.exch(a, i, min);
		}
	}
}
