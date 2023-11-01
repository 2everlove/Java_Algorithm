package chap01;

import java.util.Scanner;

//1,2,…,nの合計を求めます。

public class SumForPos {

	public static void main(String[] args) {
		try (Scanner stdIn = new Scanner(System.in)) {
			System.out.println("１からｎまでの合計を求めます。");
			int n;
			do {
				System.out.println("nの値：");
				n = stdIn.nextInt();
			} while(n<=0);
			
			int sum = 0;
			
			for(int i=1; i<=n; i++) sum += i;
			System.out.println("1から"+n+"までの合計は"+sum+"です。");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}
