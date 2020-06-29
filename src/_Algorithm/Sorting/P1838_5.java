package _Algorithm.Sorting;

import java.io.*;
import java.util.*;
public class P1838_5 {
	static class P implements Comparable<P>{
		int x,v;
		P(int X,int V){
			x=X;
			v=V;
		}
		public int compareTo(P p){
			return v-p.v;
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),R=0,x=0,i=0;
		StringTokenizer t=new StringTokenizer(r.readLine());
		PriorityQueue<P>q=new PriorityQueue();
		for(;i<n;q.add(new P(i++,Integer.parseInt(t.nextToken()))));
		while(!q.isEmpty()) {
			P p=q.poll();
			R=R>p.x-x?R:p.x-x;
		x++;
		}
		System.out.println(R);
	}
}