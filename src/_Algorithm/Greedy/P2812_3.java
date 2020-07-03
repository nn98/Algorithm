package _Algorithm.Greedy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P2812_3 {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt();
		Deque<Character>d=new LinkedList();
		for(char c:s.next().toCharArray()) {
			if(!d.isEmpty())
				if(k>0&d.peekLast()<c) {
					d.pollLast();
					k--;
				}
			d.add(c);
		}
		for(n=d.size()-k;n-->0;)
			System.out.print(d.poll());
	}
}