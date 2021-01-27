package main.java.chapter02;

import main.java.Example;

/**
 * @author yihailong
 * @since 2021-01-27 17:41
 */
public class Insertion {

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

			for (int j = i; j > 0 && Example.less(a[j], a[j - 1]); j--) {
				Example.exch(a, j, j - 1);
			}
		}
	}
}
