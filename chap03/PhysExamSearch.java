package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/*
何cmの人を検索していましか。174
検索結果：f 174 1.2
 */
public class PhysExamSearch {
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER =
				new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 :
					(d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("a", 162, 0.3),
				new PhyscData("b", 173, 0.7),
				new PhyscData("c", 175, 2.0),
				new PhyscData("d", 171, 1.5),
				new PhyscData("e", 168, 0.4),
				new PhyscData("f", 174, 1.2),
				new PhyscData("g", 169, 0.8),
		};
		
		System.out.print("何cmの人を検索していましか。");
		int height = stdIn.nextInt();
		int idx = Arrays.binarySearch(
				x, 
				new PhyscData("", height, 0.0),
				PhyscData.HEIGHT_ORDER
		);
		
		if(idx == -1) System.out.println("その値の要素はありません。");
		else System.out.println("検索結果："+x[idx]);

	}

}
