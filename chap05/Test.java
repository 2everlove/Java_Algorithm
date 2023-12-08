package chap05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
	static int spread = 0;
    static int[][] land;
    static boolean[][] vis;
    static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		land = new int[100][100];
		vis = new boolean[100][100]; 
		int sima = sc.nextInt();
		spread = sc.nextInt();
		if(sima > 100 || sima < 1) return;
		try {
			for(int i = 0; i < sima; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				land[x][y] = 1;
				boom(x, y);
			}
		} catch (Exception e) {
			return;
		}
		
		Queue<String> q = new LinkedList<String>();
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(land[i][j] == 1 && vis[i][j] == false) {
					q.add(i+","+j);
					bfs(i,j, q);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	
	static void boom(int x, int y) {
		if(x != 0)
			if(x - spread >= 0) {
				if(x + spread < 100) {
					for(int a = x - spread; a <= x+spread; a++) {
						if(y != 0)
							if(y - spread >=0) {
								if(y + spread < 100) {
									for(int b = y - spread; b <= y+spread; b++) {
										land[a][b] = 1;
									}
								} else {
									for(int b = y - spread; b < 100; b++) {
										land[a][b] = 1;
									}
								}
								
							} else {
								for(int b = 0; b <= y+spread; b++) {
									land[a][b] = 1;
								}
							}
					}
				} else {
					for(int a = x - spread; a < 100; a++) {
						if(y != 0)
							if(y - spread >=0) {
								if(y + spread < 100) {
									for(int b = y - spread; b <= y+spread; b++) {
										land[a][b] = 1;
									}
								} else {
									for(int b = y - spread; b < 100; b++) {
										land[a][b] = 1;
									}
								}
								
							} else {
								for(int b = 0; b <= y+spread; b++) {
									land[a][b] = 1;
								}
							}
					}
				}
				
			} else {
				for(int a = 0; a <= x+spread; a++) {
					if(y != 0)
						if(y - spread >=0) {
							if(y + spread < 100) {
								for(int b = y - spread; b <= y+spread; b++) {
									land[a][b] = 1;
								}
							} else {
								for(int b = y - spread; b < 100; b++) {
									land[a][b] = 1;
								}
							}
							
						} else {
							for(int b = 0; b <= y+spread; b++) {
								land[a][b] = 1;
							}
						}
				}
			}
	}
	
	static void bfs(int x, int y, Queue<String> q) {
		while(!q.isEmpty()) {
			String str = q.remove();
            int row = Integer.parseInt(str.split(",")[0]);
            int col = Integer.parseInt(str.split(",")[1]);
            if(row<0 || col<0 || row>=100 || col>=100 || land[row][col]!=1 || vis[row][col]) continue;
            vis[row][col]=true;
            q.add(row+","+(col-1));
            q.add(row+","+(col+1));
            q.add((row-1)+","+col);
            q.add((row+1)+","+col);
		} ;
	}
}
