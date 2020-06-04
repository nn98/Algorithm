package _Algorithm.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1766_3 {

	static int n,m,i,j,d[];
	static List<List>l=new ArrayList();
	static void o() {
		PriorityQueue<Integer>q=new PriorityQueue();
		for(i=0;++i<n;)if(d[i]==0)q.offer(i);
		while(!q.isEmpty()) {
			m=q.poll();
			for(Object t:l.get(m)) {
				int c=(Integer)t;
				d[c]--;
				if(d[c]==0)q.offer(c);
			}
			System.out.print(m+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		m=s.nextInt();
		d=new int[n];
		for(;i++<n;l.add(new ArrayList()));
		for(;m-->0;) {
			l.get(s.nextInt()).add((i=s.nextInt()));
			d[i]++;
		}
		o();
//		System.out.println(Arrays.toString(d));
//		for(List a:l)System.out.println(a);
	}

}
