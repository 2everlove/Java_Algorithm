package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S015 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        StringBuilder abc = new StringBuilder("ABC");
        StringBuilder abc2 = new StringBuilder("AABCBABCC");
        
        List<Long> n = new ArrayList<Long>();
        n.add(3L);
        Long num = 0L;
        for(int i = 1; i <= k; i++) {
        	num = 3 + n.get(i-1)*2;
        	n.add(num);
        }
        
        if(k > 50 || k < 1) return;
		if(s > t || s < 1) return;
		if(s > num || t > num) return;
		if(((t-s)+1) > 100 || ((t-s)+1) < 1) return;
        
        List<StringBuilder> abcList = new ArrayList<StringBuilder>();
        abcList.add(abc);
        abcList.add(abc2);
        if(k == 1) {
            System.out.println(abc.substring(s - 1, t));
            return;
        } 
        else if (k == 2) {
            System.out.println(abc2.substring(s - 1, t));
            return;
        }
        for (int i = 2; i <= k; i++) {
        	StringBuilder sb = new StringBuilder(16777216);
        	sb.append("A");
        	sb.append(abcList.get(i-1));
        	sb.append("B");
        	sb.append(abcList.get(i-1));
        	sb.append("C");
            abcList.add(sb);
        }
        
        
        System.out.println(abcList.get(k).toString().substring(s, t+1));
    }
}
