package BaekJoon.DFS;
// ������ �ڵ��� �Ӱ����� ����
import java.io.*;
import java.util.*;
public class P15681 {
	static int N,R,Q,a[],i,j,h[];
	static Node[]l;
	static void o(int x,int y) {
		if(l[x]==null)l[x]=new Node(x);
		if(l[y]==null)l[y]=new Node(y);
		if(x==R) {
			l[x].n=-1;
			l[x].c.add(l[y]);
			l[y].o(x);
		}else if(y==R) {
			l[y].n=-1;
			l[y].c.add(l[x]);
			l[x].o(y);
		}else if(l[x].p!=null) {
			l[x].c.add(l[y]);
			l[y].o(x);
		}else if(l[y].p!=null) {
			l[y].c.add(l[x]);
			l[x].o(y);
		}else {
			l[x].c.add(l[y]);
			l[y].c.add(l[x]);
		}
	}
	static class Node{
		Node p;
		List<Node>c=new ArrayList();
		Node(int N){
			this.N=N;
		}
		int n=0,N;
		void o(int x) {
			if(c.contains(l[x]))
				c.remove(l[x]);
			p=l[x];
			n=x;
			for(Node n:c)n.o(N);
		}
		int getH() {
			int x=1;
			for(Node n:c)x+=n.getH();
			return h[N]=x;
		}
		@Override
		public String toString() {
			StringBuffer f=new StringBuffer();
			for(Node n:c)f.append(n.N+" ");
			return String.format("Node %d, P-%d, c-%s",N,n,f);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		N=Integer.parseInt(t.nextToken());
		R=Integer.parseInt(t.nextToken());
		Q=Integer.parseInt(t.nextToken());
		h=new int[N+1];
		l=new Node[N+1];
		for(;++i<N;) {
			t=new StringTokenizer(r.readLine());
			o(Integer.parseInt(t.nextToken()),Integer.parseInt(t.nextToken()));
		}
		for(i=0;i++<Q;) {
			j=Integer.parseInt(r.readLine());
			w.write((h[j]==0?l[j].getH():h[j])+"\n");
		}
		w.flush();
	}
}