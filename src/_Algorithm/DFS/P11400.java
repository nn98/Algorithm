package _Algorithm.DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P11400 {

	static List z,l[];
	static int m,dis[],i,j;
	static int o(int x,int p) {
		dis[x]=++m;
		int r=dis[x],i=0,n,v;
		for(;i<l[x].size();i++) {
			n=(int)l[x].get(i);
			if(n==p)continue;
			if(dis[n]>0) {
				r=r<dis[n]?r:dis[n];
				continue;
			}
			v=o(n,x);
			if(v>dis[x])z.add(x<n?x:n+" "+(x>n?x:n));
			r=r<v?r:v;
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int v=s.nextInt()+1,e=s.nextInt();
		dis=new int[v];
		z=new ArrayList();
		l=new ArrayList[v];
		for(i=v;i-->1;l[i]=new ArrayList());
		for(;e-->0;i=s.nextInt(),j=s.nextInt(),l[i].add(j),l[j].add(i));
		for(i=0;++i<v;j=dis[i]==0?o(i,0):0);
		System.out.println(z.size());
		Collections.sort(l[0]);
		for(i=0;i<z.size();System.out.println(l[0].get(i++)));
	}

}
