package chap05;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test1 {
	static int n, cnt;
	static String str;
	static Set<Integer> set = new HashSet<Integer>();
	public static int countPasswords(int[] digits, int[] appear) {
        // パスワードの桁数
        int n = digits.length;

        // パスワードの各桁に現れる可能性がある数字を格納する配列
        BitSet[] possibilities = new BitSet[n];

        // 各桁に現れる可能性がある数字を初期化
        for (int i = 0; i < n; i++) {
            possibilities[i] = new BitSet(10);
            for (int j = 0; j < 10; j++) {
                possibilities[i].set(j);
            }
        }

        // 各桁に現れる可能性がある数字を、装置から得られた情報に基づいて更新する
        for (int i = 0; i < n; i++) {
            if (digits[i] != 0) {
                possibilities[i].clear(digits[i]);
                for (int j = i + 1; j < n; j++) {
                    if (appear[digits[i]] <= j) {
                        possibilities[j].clear(digits[i]);
                    }
                }
            }
        }

        // パスワードの各桁に現れる数字の組み合わせの総数を計算する
        int count = 1;
        for (int i = 0; i < n; i++) {
            count *= possibilities[i].cardinality();
        }

        // 答えを 1,000,000,007 で割った余りを返す
        return count % 1000000007;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n > 1000 || n < 1) return;
		int passList[] = new int[10];
		int appear1[] = null;		
		
		for(int i = 0; i < passList.length; i++) {
			passList[i] = sc.nextInt();
			if(!(passList[i] > n || passList[i] < 0)) set.add(passList[i]);
		}
		System.out.println("入力例 1: " + countPasswords(passList, appear1)); // 3
	}

}
