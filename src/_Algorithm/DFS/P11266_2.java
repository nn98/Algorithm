package _Algorithm.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P11266_2 {

	static int v,e,d[],c[],i,n,f,t;
	static List<Integer>[]l;
	static int o(int x,boolean y) {
		d[x]=++f;
		int r=d[x],h=0,i=0,N,p;
		for(;i<l[x].size();) {
			N=l[x].get(i);
			if(d[N]>0) {
				r=r<d[N]?r:d[N];
				continue;
			}
			h++;
			p=o(N,false);
			if(!y&&p>=d[x])c[x]++;
			r=r<p?r:p;
		}
		if(y)c[x]=h>=2?1:0;
		return r;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		v=s.nextInt()+1;
		e=s.nextInt();
		d=new int[v];
		c=new int[v];
		l=new List[v];
		for(;++i<v;l[i]=new ArrayList());
		for(;e-->0;f=s.nextInt(),t=s.nextInt(),l[f].add(t),l[t].add(f));
		f=0;
		for(i=0;++i<v;)if(d[i]==0)o(i,true);
		for(i=0;++i<v;n+=c[i]>0?1:0);
		System.out.println(n);
		for(i=0;++i<v;System.out.print(c[i]>0?i+" ":""));
	}

}