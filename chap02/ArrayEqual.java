package chap02;

import java.util.Scanner;
/*
配列aの要素：5
a[0]：10
a[1]：73
a[2]：2
a[3]：-5
a[4]：42
配列bの要素：5
b[0]：10
b[1]：73
b[2]：2
b[3]：-5
b[4]：42
配列aとｂは同じです。
 */
public class ArrayEqual {
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) return false;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("配列aの要素：");
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.print("a["+i+"]：");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("配列bの要素：");
		int nb = stdIn.nextInt();
		
		int[] b = new int[na];
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b["+i+"]：");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("配列aとｂは"
				+ (equals(a, b) ? "同じです。":"違います。"));
	}

}
