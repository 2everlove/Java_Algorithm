package chap01;
// 三つの整数値の中で最大値を取得

public class Max3m {
	//a,b,cの最大値を取得
	static void max(int a, int b, int c) {
		int max = a;
		String result = "max("+a+","+b+","+c+") = ";
		if(b > max) max = b;
		if(c > max) max = c;
		result += max;
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		max(3,2,1);
		max(3,2,2);
		max(3,1,2);
		max(2,1,3);
		max(3,3,2);
		max(3,3,3);
		max(2,2,3);
		max(2,3,1);
		max(2,3,2);
	}
}
