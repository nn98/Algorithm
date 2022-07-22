package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1325_4 {
	static List<Integer>q=new ArrayList(),l[],p=new ArrayList();
	static int n,m,i,k,j,h[],V[];
	static int o(int x) {
//		System.out.print("at-"+x);
		h[x]++;
		int v=1;
		for(int y:l[x]) {
			if(h[y]<1) {
				v+=o(y);
			}
		}
//		System.out.println("\tre-"+v);
		j=j>v?j:v;
		V[x]=v;
		return v;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		V=new int[n];
		l=new List[n];
		for(;k<n;l[k++]=new ArrayList());
		for(k=0;k<m;k++) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			l[Integer.parseInt(t.nextToken())].add(i);
		}
//		for(List L:l) {
//			System.out.println(L.toString());
//		}
		for(i=0;++i<n;) {
			h=new int[n];
			if(h[i]<1)o(i);
		}
		System.out.println(Arrays.toString(V));
		for(i=0;++i<n;System.out.print(V[i]==j?i+" ":""));
	}

}
