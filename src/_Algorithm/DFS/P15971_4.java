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
	
	static void d() {
		PriorityQueue<N>q=new PriorityQueue();
		q.offer(new N(x,0,0));
		while(!q.isEmpty()) {
			L=q.poll();
			a=L.x;
			v=L.v;
			b=L.m;
			if(a==y) {
				R=v-b;
				break;
			}
			for(i=0;i<l[a].size();i++) {
				int ne=l[a].get(i).x,nv=l[a].get(i).v;
				if(d[ne]>v+nv) {
					d[ne]=v+nv;
					q.offer(new N(ne,v+nv,Math.max(b, nv)));
				}
			}
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
