package chap02;

import java.util.Random;
import java.util.Scanner;
/*
キーの最大値を求めます。
人数:5
heightは以下となります。
height[0]184
height[1]181
height[2]167
height[3]106
height[4]106
 */
public class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++)
			if(a[i] > max) max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("キーの最大値を求めます。");
		System.out.print("人数:");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("heightは以下となります。");
		
		for(int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"]"+height[i]);
		}
	}

}
