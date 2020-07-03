package _Algorithm.Greedy;

import java.util.*;

public class P2812_3 {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),i=0;
		Deque<Character>d=new LinkedList();
		char[]a=s.next().toCharArray();
		for(;i<n;) {
			while(!d.isEmpty())
				if(d.peekLast()<a[i]&k>0) {
					d.pollLast();
					k--;
				}else break;
			d.add(a[i++]);
		}
		for(n=d.size()-k;n-->0;)
			System.out.print(d.poll());
	}
}