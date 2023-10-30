package chap01;

import java.util.Scanner;
//三つの整数値を入力して最大値を取得

public class Max3 {

	public static void main(String[] args) {
		int max = 0;
		try (Scanner stdIn = new Scanner(System.in)) {
			System.out.println("三つの整数の最大値は？");
			System.out.println("aの値：");int a = stdIn.nextInt();
			System.out.println("bの値：");int b = stdIn.nextInt();
			System.out.println("cの値：");int c = stdIn.nextInt();
			
			max = a;
			if(b > max) max = b;
			if(c > max) max = c;
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			System.out.println("最大値は" + max + "です。");
		}
	}
}
