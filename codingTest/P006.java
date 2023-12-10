package codingTest;

import java.io.IOException;
import java.util.Scanner;

public class P006 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int start_ind = 1;
		int end_ind = 1;
		int sum = 1;
		
		while (end_ind != N) {
			if(sum == N) {
				count ++;
				end_ind++;
				sum = sum + end_ind;
			} else if (sum > N) {
				sum = sum - start_ind;
				start_ind++;
			} else {
				end_ind++;
				sum = sum + end_ind;
			}
		}
		System.out.println(count);
	}

}
