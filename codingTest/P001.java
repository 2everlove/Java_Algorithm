package codingTest;

import java.util.Scanner;

public class P001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		
		int[] subjects = new int[total];
		
		int sumTotal = 0;
		int max = 0;
		for(int i = 0; i < subjects.length; i++) {
			subjects[i] = sc.nextInt();
			sumTotal += subjects[i];
			if(subjects[i] > max) max = subjects[i];
		}
		
		System.out.println((sumTotal*100)/(max*total));
	}

}
