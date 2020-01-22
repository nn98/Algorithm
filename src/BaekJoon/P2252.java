package BaekJoon;

import java.util.*;

public class P2252 {

	static int n,m,a[],i=0,N,p,q;
	static List<List<Integer>>l=new ArrayList();
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		N=n=s.nextInt();
		m=s.nextInt();
		a=new int[++N];
		for(;i++<N;l.add(new ArrayList()));
		for(i=0;i++<m;) {
			p=s.nextInt();
			q=s.nextInt();
			l.get(p).add(q);
			a[q]++;
		}
		o();
	}
	static void o() {
		Queue<Integer>q=new LinkedList();
		for(i=1;i<N;i++)if(a[i]==0)q.add(i);
		for(i=0;i<n;i++) {
			int v=q.remove();
			System.out.print(v+" ");
			for(int V:l.get(v)) {
				a[V]--;
				if(a[V]==0)q.add(V);
			}
		}
	}
}
