package chap02;

import java.util.Scanner;

/*
キーの最大値を求めます。
人数:5
height[0]:172
height[1]:153
height[2]:192
height[3]:140
height[4]:165
最大値は192です。
 */
public class MaxOfArray {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("キーの最大値を求めます。");
		System.out.print("人数:");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("height["+i+"]:");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("最大値は"+maxOf(height)+"です。");
	}

}
