package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P15681 {
	static int N,R,Q,a[],i,j,k;
	static Node[]l;
	static void o(int x,int y) {
		if(l[x]==null)l[x]=new Node();
		if(l[y]==null)l[y]=new Node();
		if(x==N) {
			l[x].c.add(l[y]);
			l[y].p=l[x];
		}else if(y==N) {
			l[y].c.add(l[x]);
			l[x].p=l[y];
		}else if(l[x].p!=null) {
			l[x].c.add(l[y]);
			l[y].p=l[x];
		}else if(l[y].p!=null) {
			l[y].c.add(l[x]);
			l[x].p=l[y];
		}else {
			l[x].c.add(l[y]);
			l[y].c.add(l[x]);
		}
		System.out.println(l[x]);
		System.out.println(l[y]);
	}
	static class Node{
		Node p;
		List<Node>c=new ArrayList();
		int n=-1;
		void o(int x) {
			if(c.contains(l[x]))
				c.remove(l[x]);
			p=l[x];
			n=x;
		}
		@Override
		public String toString() {
			return String.format("P-%d, cSize-%d",n,c.size());
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		N=Integer.parseInt(t.nextToken());
		R=Integer.parseInt(t.nextToken());
		Q=Integer.parseInt(t.nextToken());
		l=new Node[N+1];
		for(;i++<N;) {
			t=new StringTokenizer(r.readLine());
			o(Integer.parseInt(t.nextToken()),Integer.parseInt(t.nextToken()));
			
		}
	}
}