package chap02;

public class CloneArray {
/*
a = 1 2 3 4 5
b = 1 2 3 0 5
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		
		b[3] = 0;
		
		System.out.print("a =");
		for(int i = 0; i < a.length; i++)
			System.out.print(" "+a[i]);
		
		System.out.print("\nb =");
		for(int i = 0; i < b.length; i++)
			System.out.print(" "+b[i]);
	}

}
