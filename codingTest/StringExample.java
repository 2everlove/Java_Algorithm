package codingTest;

import java.util.ArrayList;
import java.util.List;

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
