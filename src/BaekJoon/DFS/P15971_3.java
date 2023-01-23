package BaekJoon.DFS;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class P15971_3 {
	static int n,x,y,i,j,q,v[];
	static long p,k;
	static List<N>[]l;
	static class N{
		int n,m;
		N(int a,int b){
			n=a;
			m=b;
		}
	}
	static void o(int x,int m) {
//		System.out.println(x+" "+m+" "+k);
		if(x==y)p=m;
		if(p>0)return;
		v[x]++;
		for(N n:l[x]) {
			if(v[n.n]<1) {
				k+=n.m;
				m=m>n.m?m:n.m;
				o(n.n,m);
				if(p<1)k-=n.m;
				if(p>0)return;
			}
		}
		v[x]--;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		x=Integer.parseInt(t.nextToken());
		y=Integer.parseInt(t.nextToken());
		v=new int[n];
		l=new List[n];
		for(;++i<n;l[i]=new ArrayList());
		for(;++k<n-1;) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			q=Integer.parseInt(t.nextToken());
			l[i].add(new N(j,q));
			l[j].add(new N(i,q));
		}
		p=k=0;
		o(x,0);
		System.out.println(k-p);
	}
}