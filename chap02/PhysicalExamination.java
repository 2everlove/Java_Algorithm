package chap02;

import java.util.Scanner;
/*
■身体検査一覧■
名前　 身長 視力
------------
a    162  0.3
b    173  0.7
c    175  2.0
d    171  1.5
e    168  0.4
f    174  1.2
g    169  0.8

平均身長：170.3cm

視力分布
0.0~: 0人
0.1~: 0人
0.2~: 0人
0.3~: 1人
0.4~: 1人
0.5~: 0人
0.6~: 0人
0.7~: 1人
0.8~: 1人
0.9~: 0人
1.0~: 0人
1.1~: 0人
1.2~: 1人
1.3~: 0人
1.4~: 0人
1.5~: 1人
1.6~: 0人
1.7~: 0人
1.8~: 0人
1.9~: 0人
2.0~: 1人
 */
public class PhysicalExamination {
	static final int VMAX = 21;
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(PhyscData[] data) {
		double sum = 0;
		
		for(int i = 0; i< data.length; i++) {
			sum += data[i].height;
		}
		return sum / data.length;
	}
	
	static void distVision(PhyscData[] data, int[] dist) {
		int i = 0;
		
		dist[i] = 0;
		for(i =0; i < data.length; i++)
			if(data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0)
				dist[(int)(data[i].vision * 10)]++;
	}
	
	public static void main(String[] args) {
		PhyscData[] x = {
				new PhyscData("a", 162, 0.3),
				new PhyscData("b", 173, 0.7),
				new PhyscData("c", 175, 2.0),
				new PhyscData("d", 171, 1.5),
				new PhyscData("e", 168, 0.4),
				new PhyscData("f", 174, 1.2),
				new PhyscData("g", 169, 0.8),
		};
		int[] vdist = new int[VMAX];
		System.out.println("■身体検査一覧■");
		System.out.println("名前　 身長 視力");
		System.out.println("------------");
		
		for(int i = 0; i < x.length; i++)
			System.out.printf("%-5s%3d%5.1f\n",x[i].name, x[i].height, x[i].vision);
		
		System.out.printf("\n平均身長：%5.1fcm\n",aveHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("\n視力分布");
		for(int i = 0; i < VMAX; i++)
			System.out.printf("%3.1f~:%2d人\n",i/ 10.0, vdist[i]);
	}

}
