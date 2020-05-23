package _Algorithm.DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P11400 {

	static List[]l;
	static int m,dis[],i,j;
	static int o(int x,int p) {
		dis[x]=++m;
		int ret=dis[x],i=0;
		for(;i<l[x].size();i++) {
			int nex=(int)l[x].get(i);
			if(nex==p)continue;
			if(dis[nex]>0) {
				ret=Math.min(ret,dis[nex]);
				continue;
			}
			int pre=o(nex,x);
			if(pre>dis[x])l[0].add((x<nex?x:nex)+" "+(x>nex?x:nex));
			ret=Math.min(ret, pre);
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int v=s.nextInt()+1,e=s.nextInt();
		dis=new int[v];
		l=new ArrayList[v];
		for(i=v;i-->0;l[i]=new ArrayList());
		for(;e-->0;i=s.nextInt(),j=s.nextInt(),l[i].add(j),l[j].add(i));
		for(i=0;++i<v;j=dis[i]==0?o(i,0):0);
		System.out.println(l[0].size());
		Collections.sort(l[0]);
		for(i=0;i<l[0].size();System.out.println(l[0].get(i++)));
	}

}
