
package com.classproblem;

public class PraGenericUC3 <X, Y, Z> {
	X[] myXArray;
	Y[] myYArray;
	Z[] myZArray;


	public PraGenericUC3(X[] myXArray, Y[] myYArray, Z[] myZArray) {
		super();
		this.myXArray = myXArray;
		this.myYArray = myYArray;
		this.myZArray = myZArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {1,5,10};
		Double[] b = {1.1, 3.5, 5.6};
		Character[] c = {'a', 'c', 'g'};

//		toPrint(a);
//		toPrint(b);
//		toPrint(c);
		new PraGenericUC3<Integer, Double, Character>(a, b, c).toPrint();

	}
	private void toPrint() {
		toPrint(myXArray);
		toPrint(myYArray);
		toPrint(myZArray);
	}
	private static <E> void toPrint(E[] a) {

		for (E i:a) {
			System.out.println(i);  
		}
	}
}

