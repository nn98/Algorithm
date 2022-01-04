package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P15971_4 {

	static int n,x,y,i,R,v,a,b,d[];
	static List<N>[]l;
	static N L;
	
	static class N implements Comparable<N>{
		int x,v,m;
		N(int a,int b,int c){
			x=a;
			v=b;
			m=c;
		}
		@Override
		public int compareTo(N n) {
			return Integer.compare(v, n.v);
		}
	}
	
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		x=Integer.parseInt(t.nextToken());
		y=Integer.parseInt(t.nextToken());
		l=new List[n];
		d=new int[n];
		for(;++i<n;l[i]=new ArrayList(),d[i]=Integer.MAX_VALUE);
		for(i=1;++i<n;) {
			t=new StringTokenizer(r.readLine());
			a=Integer.parseInt(t.nextToken());
			b=Integer.parseInt(t.nextToken());
			v=Integer.parseInt(t.nextToken());
			l[a].add(new N(b,v,0));
			l[b].add(new N(a,v,0));
		}
	}
}
