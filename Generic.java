package com.classproblem;

public class PraGenericUC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,5,10};
		Double[] b = {1.1, 3.5, 5.6};
		Character[] c = {'a', 'c', 'g'};

		toPrint(a);
		toPrint(b);
		toPrint(c);
	}
	private static <E> void toPrint(E[] a) {

		for (E i:a) {
			System.out.println(i);  
		}
	}
}
