package _Algorithm.Greedy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P2812_2 {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),t;
		n-=k;
		Deque<Integer>d=new LinkedList();
		for(char c:s.next().toCharArray()) {
			t=c-'0';
			if(!d.isEmpty())
				if(k>0&d.peekLast()<t) {
					d.pollLast();
					k--;
				}
			d.push(t);
		}
		for(;n-->0;)
			System.out.print(d.pop());
	}
}
