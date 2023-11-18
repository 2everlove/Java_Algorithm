package chap02;

import java.util.Scanner;
/*
10進数を基数変換します。
変換する負ではなく整数:59
どんな進数に変換しましょうか？(2~36)2
2進数としては 111011です。
もう一度しましょうか。(1.はい/0.いいえ)：0
 */
public class CardConvRev {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);
		return digits;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10進数を基数変換します。");
		do {
			do {
				System.out.print("変換する負ではなく整数:");
				no = stdIn.nextInt();
			} while (no < 0);
			
			do {
				System.out.print("どんな進数に変換しましょうか？(2~36)");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd+"進数としては ");
			for(int i = dno - 1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("です。");
			
			System.out.print("もう一度しましょうか。(1.はい/0.いいえ)：");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}

}
