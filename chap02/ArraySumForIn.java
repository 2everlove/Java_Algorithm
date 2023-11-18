package chap02;

public class ArraySumForIn {
/*
a[0] = 1.0
a[1] = 2.0
a[2] = 3.0
a[3] = 4.0
a[4] = 5.0
全ての要素の合計は15.0です。
 */
	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		double sum = 0;
		
		for(double i : a) sum += i;
		System.out.println("全ての要素の合計は"+sum+"です。");
	}

}
