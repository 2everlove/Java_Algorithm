package codingTest;

import java.util.Scanner;

public class P002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		String number = scanner.next();
		
		char[] cList = number.toCharArray();
		
		int sum = 0;
		
		for(int i = 0; i < total; i++) {
			sum += cList[i] - '0';
		}
		
		System.out.println(sum);		
	}

}
