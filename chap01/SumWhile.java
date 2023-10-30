package chap01;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		try (Scanner stdin = new Scanner(System.in)) {
			System.out.println("1からｎまでの合計を求めます。");
			System.out.println("nの値：");
			int n = stdin.nextInt();
			
			int sum = 0;
			int i = 1;
			
			while(i <= n) {
				sum += i;
				i++;
			}
			System.out.println("1から"+n+"までの合計は"+sum+"です。");
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
}
