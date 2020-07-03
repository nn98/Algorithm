package _Algorithm.Greedy;

import java.util.*;
public class P2812_2 {
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