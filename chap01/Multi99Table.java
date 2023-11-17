package chap01;

public class Multi99Table {
/*
掛け算の表
 |  1  2  3  4  5  6  7  8  9
--+--------------------------
1|  1  2  3  4  5  6  7  8  9
2|  2  4  6  8 10 12 14 16 18
3|  3  6  9 12 15 18 21 24 27
4|  4  8 12 16 20 24 28 32 36
5|  5 10 15 20 25 30 35 40 45
6|  6 12 18 24 30 36 42 48 54
7|  7 14 21 28 35 42 49 56 63
8|  8 16 24 32 40 48 56 64 72
9|  9 18 27 36 45 54 63 72 81

*/
	public static void main(String[] args) {
		System.out.println("掛け算の表");
		
		for(int i = 0; i <= 9; i++) {
			for(int j = 0; j <= 9; j++) {
				if(j == 0) {
					if(i != 0) System.out.print(i+"|");
					else System.out.print(" |");
				}
				if(i*j != 0) System.out.printf("%3d", i * j);
				else {
					if(j != 0) System.out.printf("%3d",j);
				}
				//%3dって最低3桁以上の定数
			}
			System.out.println();
			if(i == 0) System.out.println("--+--------------------------");
		}

	}

}
