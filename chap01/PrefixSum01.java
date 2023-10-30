package chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrefixSum01 {

/**
누적합
구현
그래프이론
DFS
BFS
트리순회
완탐
백트래킹
비트마스킹
그리디
라인스위핑
투포인터
LIS
이분탐색
DP
최단거리
펜윅트리
10
20
30
40
50
60
70
80	 
90 
100
*/
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 10;
		int[] arr = new int[n + 1];
		int[] sum = new int[n + 1]; // 新たな配列生成
		
		// init
		for(int i = 1; i <= n; i++) {
			try {
				arr[i] = Integer.parseInt(br.readLine());
				sum[i] = sum[i - 1] + arr[i];
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			
		}
		
		int result = 0;
		
		for(int num : sum) {
			int tmpNum = Math.abs(num - 100);
			int tmpResult = Math.abs(result - 100);
		
			if(tmpResult < tmpNum) continue;
			
			result = num;
		}
		System.out.println(result);
	}

}
