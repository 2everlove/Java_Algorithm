package chap05;

import java.util.Scanner;
/*
整数を入力してください：3
3の階乗は6です。

 */
public class Factorial {
	
	static int factorial(int n) {
		if(n > 0)
			return n*factorial(n-1);
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数を入力してください：");
		int x = stdIn.nextInt();
		
		System.out.println(x+"の階乗は"+factorial(x)+"です。");
	}

}
