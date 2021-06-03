package com.classproblem;

public class PraGenericUC2 <E> {
	E[] myArray;

	public PraGenericUC2(E[] myArray) {
		this.myArray = myArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,5,10};
		Double[] b = {1.1, 3.5, 5.6};
		Character[] c = {'a', 'c', 'g'};

		toPrint(a);
		toPrint(b);
		toPrint(c);
		new PraGenericUC2<Integer>(a).toPrint(a);
		new PraGenericUC2<Double>(b).toPrint(b);
		new PraGenericUC2<Character>(c).toPrint(c);
	}
	private void toPrint() {
		toPrint(myArray);
	}
	private static <E> void toPrint(E[] a) {

		for (E i:a) {
			System.out.println(i);  
		}
	}
}
