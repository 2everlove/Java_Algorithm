package chap05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class T1 {
	static int H,W;
	static boolean[][] vis;
	static int[][] color;
	public static void main(String[] args) {
        // 入力を受け取る
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        String[] s = new String[H];
        for (int i = 0; i < H; i++) {
            s[i] = sc.next();
        }
        
        

        // 各位置の色を記録する
        color = new int[H][W];
        vis = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
            	if(s[i].charAt(j) == 'R') {
            		color[i][j] = 0;
            	} else if (s[i].charAt(j) == 'G') {
            		color[i][j] = 1;
            	}else {
            		color[i][j] = 2;
            	}
            	vis[i][j] = false;
            }
        }
        int[] count = new int[3];
        // BFSを行う
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
            	queue.add(i+","+j);
                if (color[i][j] == 0 && !vis[i][j]) {
                	bfs(i,j,queue,0);
                	count[0]++;
                } else if(color[i][j] == 1 && !vis[i][j]) {
                	bfs(i,j,queue,1);
                	count[1]++;
                } else if(color[i][j] == 2 && !vis[i][j]) {
                	bfs(i,j,queue,2);
                	count[2]++;
                }
            }
        }

        // 出力する
        System.out.println(count[0] + " " + count[1] + " " + count[2]);
    }
	
	static void bfs(int x, int y, Queue<String> q, int n) {
		while(!q.isEmpty()) {
			String str = q.remove();
            int row = Integer.parseInt(str.split(",")[0]);
            int col = Integer.parseInt(str.split(",")[1]);
            if(row<0 || col<0 || row>=H || col>=W || color[row][col] != n|| vis[row][col]) continue;
            vis[row][col]=true;
            q.add(row+","+(col-1));
            q.add(row+","+(col+1));
            q.add((row-1)+","+col);
            q.add((row+1)+","+col);
		} ;
	}
}
