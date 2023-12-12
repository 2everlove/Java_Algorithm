package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P008 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		long[] A = new long[N];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		int Result = 0;
		for(int k = 0; k < N; k++) {
			long search = A[k];
			int i = 0;
			int j = N -1;
			
			while(i < j) {
				if(A[i] + A[j] == search) {
					if(i != k && j != k) {
						Result++;
						break;
					} else if (i == k) {
						i++;
					} else if(j == k) {
						j--;
					}
				} else if(A[i] + A[j] < search) {
					i++;
				} else {
					j--;
				}
			}
		}
		System.out.println(Result);
		bf.close();
	}

}
