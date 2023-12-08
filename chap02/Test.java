package chap02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
https://paiza.jp/career/challenges/473/page/result
 */
public class Test {
	static int h,w;
	static boolean[][] vis;
	static int[][] rgb;
	static int[] cnt;
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			h = sc.nextInt();
			validation(h);
			w = sc.nextInt();
			validation(w);
			String[] s = new String[h];
			for (int i = 0; i < h; i++) {
			    s[i] = sc.next();
			}
			

			rgb = new int[h][w];
			vis = new boolean[h][w];
			for (int i = 0; i < h; i++) {
			    for (int j = 0; j < w; j++) {
			    	if(s[i].charAt(j) == 'R') {
			    		rgb[i][j] = 0;
			    	} else if (s[i].charAt(j) == 'G') {
			    		rgb[i][j] = 1;
			    	}else if(s[i].charAt(j) == 'B') {
			    		rgb[i][j] = 2;
			    	} else {
			    		return;
			    	}
			    	vis[i][j] = false;
			    }
			}
		} catch (Exception e) {
			return;
		}
		
        cnt = new int[3];
        
        Queue<String> q = new LinkedList<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
            	q.add(i + "," + j);
                if (rgb[i][j] == 0 && !vis[i][j]) {
                	bfs(i,j,rgb[i][j],q);
                	cnt[0]++;
                } else if(rgb[i][j] == 1 && !vis[i][j]) {
                	bfs(i,j,rgb[i][j],q);
                	cnt[1]++;
                } else if(rgb[i][j] == 2 && !vis[i][j]) {
                	bfs(i,j,rgb[i][j],q);
                	cnt[2]++;
                }
            }
        }

        System.out.println(cnt[0] + " " + cnt[1] + " " + cnt[2]);
    }
	
	static void validation(int v) throws Exception {
		if(v > 1000 || v < 1) throw new Exception();
	}
	
	static void bfs(int x, int y, int n, Queue<String> q) {
		do {
			String str = q.remove();
            int r = Integer.parseInt(str.split(",")[0]);
            int c = Integer.parseInt(str.split(",")[1]);
            if(r<0 || c<0 || r>=h || c>=w || rgb[r][c] != n|| vis[r][c]) continue;
            vis[r][c]=true;
            if(!(r<0 || c-1<0 || r>=h || c-1>=w || rgb[r][c-1] != n|| vis[r][c-1]))
            	q.add(r + "," + (c-1));
            if(!(r<0 || c+1<0 || r>=h || c+1>=w || rgb[r][c+1] != n|| vis[r][c+1]))
            	q.add(r + "," + (c+1));
            if(!(r-1<0 || c<0 || r-1>=h || c>=w || rgb[r-1][c] != n|| vis[r-1][c]))
            	q.add((r-1) + "," + c);
            if(!(r+1<0 || c<0 || r+1>=h || c>=w || rgb[r+1][c] != n|| vis[r+1][c]))
            	q.add((r+1) + "," + c);
		} while(!q.isEmpty()) ;
	}
}