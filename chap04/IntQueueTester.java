package chap04;

import java.util.Scanner;

public class IntQueueTester {
/*
現在データの数：0 / 64
(1)inqueue (2)dequeue (3)peek (4)dump (0)Exit：1
データ：1
現在データの数：1 / 64
(1)inqueue (2)dequeue (3)peek (4)dump (0)Exit：1
データ：2
現在データの数：2 / 64
(1)inqueue (2)dequeue (3)peek (4)dump (0)Exit：4
1 2 
現在データの数：2 / 64
(1)inqueue (2)dequeue (3)peek (4)dump (0)Exit：2
dequeueしたデータは1です。
現在データの数：1 / 64
(1)inqueue (2)dequeue (3)peek (4)dump (0)Exit：4
2 
現在データの数：1 / 64
(1)inqueue (2)dequeue (3)peek (4)dump (0)Exit：3
peekしたデータは2です。
現在データの数：1 / 64
(1)inqueue (2)dequeue (3)peek (4)dump (0)Exit：0	
 */
	public static void main(String[] args) {
		try (Scanner stdIn = new Scanner(System.in)) {
			IntQueue s = new IntQueue(64);
			
			while (true) {
				System.out.println("現在データの数："+s.size()+" / " + s.capacity());
				System.out.print("(1)inqueue (2)dequeue (3)peek (4)dump (0)Exit：");
				int menu = stdIn.nextInt();
				if(menu == 0) break;
				
				int x;
				switch (menu) {
				case 1: 
					System.out.print("データ：");
					x = stdIn.nextInt();
					try {
						s.enque(x);
					} catch (Exception e) {
						System.out.println("queueがいっぱいです。");	
					}
					break;
				case 2:
					try {
						x = s.deque();
						System.out.println("dequeueしたデータは"+x+"です。");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("queueが空いています。");
					}
					break;
				case 3:
					try {
						x = s.peek();
						System.out.println("peekしたデータは"+x+"です。");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("queueが空いています。");
					}
					break;
				case 4:
					s.dump();
					break;
				}
			}
		}
	}

}
