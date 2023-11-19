package chap05;

import java.util.Scanner;
/*
ハノイの塔。
円盤の数:3
円盤[1]を1柱から3柱へ運ぶ。
円盤[2]を1柱から2柱へ運ぶ。
円盤[1]を3柱から2柱へ運ぶ。
円盤[3]を1柱から3柱へ運ぶ。
円盤[1]を2柱から1柱へ運ぶ。
円盤[2]を2柱から3柱へ運ぶ。
円盤[1]を1柱から3柱へ運ぶ。
 */
public class Hanoi {
	static void move(int no, int x, int y) {
		if(no > 1)
			move(no -1, x, 6 - x -y);
		System.out.println("円盤["+no+"]を"+x+"柱から"+y+"柱へ運ぶ。");
		
		if(no > 1)
			move(no - 1, 6 - x - y, y);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("ハノイの塔。");
		System.out.print("円盤の数:");
		int n = stdIn.nextInt();
		
		move(n , 1, 3);
	}

}
