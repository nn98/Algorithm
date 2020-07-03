package _Algorithm.Greedy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P2812_3 {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),i=0;
		Deque<Character>d=new LinkedList();
		char[]a=s.next().toCharArray();
		for(;i<n;) {
			
		}
		for(n=d.size()-k;n-->0;)
			System.out.print(d.poll());
	}
}