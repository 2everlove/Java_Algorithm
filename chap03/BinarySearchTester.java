package chap03;

import java.util.Arrays;
import java.util.Scanner;
/*
要素数；7
昇順に入力してください。
x[0]:15
x[1]:27
x[2]:39
x[3]:77
x[4]:92
x[5]:108
x[6]:121
検索する値：39
39はx[2］にあります。
 */
public class BinarySearchTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数；");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		System.out.println("昇順に入力してください。");
		
		System.out.print("x[0]:");
		x[0] = stdIn.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x["+i+"]:");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i-1]);
		}
		
		System.out.print("検索する値：");
		int ky = stdIn.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx == -1) System.out.println("その値の要素はありません。");
		else System.out.println(ky+"はx["+idx+"］にあります。");
	}

}
