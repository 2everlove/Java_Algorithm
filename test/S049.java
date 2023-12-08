package test;

import java.util.Arrays;
import java.util.Scanner;

public class S049 {

	public static void main(String[] args) {
		// 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int f = sc.nextInt();
        int s = sc.nextInt();
        
        if(n > 1000 || n < 1) return;
        if(x > 1000 || x < 1) return;
        if(f > x || s > x || f < 1 || s < 1) return;
        
        int remainingLines = n;
        int r = 0;
        int speed = x;

        int h = 0;
        if(x >= n) h = 0;
        else {
        	while(remainingLines > 0) {
        		double d = s/3;
        		if (speed > Math.round(d) || speed - remainingLines >= 0) {
        			r += speed;
        			remainingLines -= speed;
        			speed -= f;
        			h += 1;
        			if(!(remainingLines > 0)) break;
        		} else {
    				r += s;
    				speed += s;
    				h += 3;
        		}
        	}
        }
        System.out.println(h);
	}

}
