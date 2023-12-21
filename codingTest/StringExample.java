package codingTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StringExample {

	public static void main(String[] args) {
		System.out.println(isPalindrome("DogeeseSeeGod"));
		String[] logs = {"id1 8 1 5 1", "id2 art can", "id3 3 6", "id4 own kit dig"};
		System.out.println(reorderLogFiles(logs));
	}
	
	public static boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;
		
		while(start < end) {
			if(!Character.isLetterOrDigit(s.charAt(start))) {
				start++;
			} else if(!Character.isLetterOrDigit(s.charAt(end))) {
				end--;
			} else {
				if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
					return false;
				}
				start ++;
				end--;
			}
		}
		return true;
	}
	
	public static void reversString(char[] s) {
		int start = 0;
		int end = s.length -1;
		
		while(start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			
			start ++;
			end --;
		}
	}
	
	public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
    public static void dfs(int x) {
	    // 현재 노드를 방문 처리
	    visited[x] = true;
	    System.out.print(x + " ");
	    // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
	    for (int i = 0; i < graph.get(x).size(); i++) {
	        int y = graph.get(x).get(i);
	        if (!visited[y]) dfs(y);
	    }
	}
	
	public static void bfs(int start) {
	    Queue<Integer> q = new LinkedList<>();
	    q.offer(start);
	    // 현재 노드를 방문 처리
	    visited[start] = true;
	    // 큐가 빌 때까지 반복
	    while(!q.isEmpty()) {
	        // 큐에서 하나의 노드를 뽑아 출력
	        int x = q.poll();
	        System.out.print(x + " ");
	        // 해당 노드와 연결된, 아직 방문하지 않은 노드들을 큐에 삽입
	        for(int i = 0; i < graph.get(x).size(); i++) {
	            int y = graph.get(x).get(i);
	            if(!visited[y]) {
	                q.offer(y);
	                visited[y] = true;
	            }
	        }
	    }
	}
	
	public static String[] reorderLogFiles(String[] logs) {
		List<String> letterList = new ArrayList<>();
		List<String> digitList = new ArrayList<>();
		
		for(String log : logs) {
			System.out.println("log.split(\" \")[1]: "+log.split(" ")[1]);
			System.out.println("log.split(\" \")[1].charAt(0): "+log.split(" ")[1].charAt(0));
			if(Character.isDigit(log.split(" ")[1].charAt(0))) {
				digitList.add(log);
			} else {
				letterList.add(log);
			}
		}
		
		letterList.sort((s1, s2) -> {
			String[] s1x = s1.split(" ", 2);
			System.out.println("s1x: "+s1.split(" ", 2));
			String[] s2x = s2.split(" ", 2);
			System.out.println("s2x: "+s2.split(" ", 2));
			int compared = s1x[1].compareTo(s2x[1]);
			if(compared == 0) {
				return s1x[0].compareTo(s2x[0]);
			} else {
				return compared;
			}
		});
		
		letterList.addAll(digitList);
		
		return letterList.toArray(new String[0]);
	}

}
