package chap03;

import java.util.Scanner;
/*
要素数：7
x[0]:22
x[1]:8
x[2]:55
x[3]:32
x[4]:120
x[5]:55
x[6]:70
検索する値：55
55はx[2］にあります。
 */
public class SeqSearch {
/*	
	static int seqSerch(int[] a, int n, int key) {
		int i = 0;
		while(true) {
			if(i == n) return -1;
			if(a[i] == key) return i;
			i++;
		}
	}
*/
	static int seqSerch(int[] a, int n, int key) {
		for(int i = 0; i < n; i++)
			if(a[i] == key)
				return i;
		return -1;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数：");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i< x.length; i++) {
			System.out.print("x["+i+"]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("検索する値：");
		int ky = stdIn.nextInt();
		
		int idx = seqSerch(x, num, ky);
		
		if(idx == -1) System.out.println("その値の要素はありません。");
		else System.out.println(ky+"はx["+idx+"］にあります。");
	}

}
