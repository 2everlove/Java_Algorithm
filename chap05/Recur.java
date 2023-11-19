package chap05;

import java.util.Scanner;
/*
整数を入力してください：4
1
2
3
1
4
1
2
 */
public class Recur {
/*	
	static void recur(int n) {
		if(n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
*/
	static void recur(int n) {
		while (n > 0) {
			recur(n -1);
			System.out.println(n);
			n = n - 2;
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数を入力してください：");
		int x = stdIn.nextInt();
		
		recur(x);
	}

}
