package chap02;

public class IntArrayInit {
/*
a[0] = 1
a[1] = 2
a[2] = 3
a[3] = 4
a[4] = 5
 */
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
	}

}
