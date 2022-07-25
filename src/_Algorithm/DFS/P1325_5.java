package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1325_5 {
	static List<Integer>q=new ArrayList(),l[],p=new ArrayList();
	static int n,m,i,k,j,h[],V[],A[];
	static void o(int x) {
//		System.out.print("at-"+x);
//		System.out.print("\t"+x);
		for(int y:l[x]) {
			if(h[y]<1) {
				h[y]++;
				V[y]++;
				o(y);
			}
		}
//		System.out.println("\tre-"+v);
//		j=j>v?j:v;
//		System.out.println(" v:"+v);
//		V[x]=V[x]>v?V[x]:v;
	}
	public static void main(String[] args)throws Exception{
		long T=System.currentTimeMillis();
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		V=new int[n];
		A=new int[n];
		l=new List[n];
		for(;k<n;l[k++]=new ArrayList());
		for(k=0;k<m;k++) {
			t=new StringTokenizer(r.readLine());
			l[Integer.parseInt(t.nextToken())].add(Integer.parseInt(t.nextToken()));
		}
		for(List L:l)System.out.println(L.toString());
		for(i=0;++i<n;) {
			h=new int[n];
			h[i]++;
			o(i);
		}
		for(int x:V)j=j>x?j:x;
		System.out.println(Arrays.toString(V));
		for(i=0;++i<n;System.out.print(V[i]==j?i+" ":""));
		System.out.println(System.currentTimeMillis()-T);
	}

}