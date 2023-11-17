package chap01;

import java.util.Scanner;

public class Digits {
/*
２の整数を入力してください。
入力：5
入力：105
入力：57
変数のno値は57になりました。 
*/
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("２の整数を入力してください。");
		
		do { 
			System.out.print("入力：");
			no = stdIn.nextInt();
		} while (no < 10 || no > 99);
		// noの値が10より小さい、又は、99より高い場合、ループを反復
		System.out.println("変数のno値は"+no+"になりました。");
	}

}
