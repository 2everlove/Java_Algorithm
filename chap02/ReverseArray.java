package chap02;

import java.util.Scanner;
/*
要素数：5
x[0]：10
x[1]：73
x[2]：2
x[3]：-5
x[4]：42
要素を逆順に並べ替えました。
x[0] = 42
x[1] = -5
x[2] = 2
x[3] = 73
x[4] = 10
 */
public class ReverseArray {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	
	public static void main(String[] args) {
		try (Scanner stdIn = new Scanner(System.in)) {
			System.out.print("要素数：");
			int num = stdIn.nextInt();
			
			int[] x = new int[num];
			
			for(int i = 0; i < num; i++) {
				System.out.print("x["+i+"]：");
				x[i] = stdIn.nextInt();
			}
			
			reverse(x);
			
			System.out.println("要素を逆順に並べ替えました。");
			for(int i = 0; i < num; i++)
				System.out.println("x[" + i + "] = " + x[i]);
		}
	}

}
