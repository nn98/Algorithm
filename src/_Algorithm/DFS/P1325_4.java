package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1325_4 {
	static List<Integer>q=new ArrayList(),l[],p=new ArrayList();
	static int n,m,i,k,j,h[],v[];
	static int o(int x) {
		System.out.print("at-"+x);
		h[x]++;
		int v=1;
		for(int y:l[x]) {
			if(h[y]<1) {
				v+=o(y);
			}
		}
		System.out.println("\tre-"+v);
		return v;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		h=new int[n];
		v=new int[n];
		l=new List[n];
		for(;i<n;l[i++]=new ArrayList());
		for(;k<m;k++) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			l[j].add(i);
		}
		for(List L:l) {
			System.out.println(L.toString());
		}
		for(i=0;++i<n;) {
			if(h[i]<1)o(i);
		}
		System.out.println(Arrays.toString(v));
	}

}
