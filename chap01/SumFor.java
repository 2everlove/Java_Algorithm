package chap01;

import java.util.Scanner;

public class SumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("1からnまでの合計は？");
		int n = stdin.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1から"+n+"までの合計は"+sum+"です。");
	}

}
