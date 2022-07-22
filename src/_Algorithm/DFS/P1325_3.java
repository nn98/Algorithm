package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1325_3 {
	static List<Integer>q=new ArrayList(),l[],p=new ArrayList();
	static int n,m,i,k,j,h[],v[];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		h=new int[n];
		v=new int[n];
		l=new List[n];
		for(;i<n;l[i++]=new ArrayList());
		for(i=0;i<m;i++) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			l[i].add(j);
			l[j].add(i);
		}
		for(i=0;i<n;i++) {
			for(int x:l[i]) {
				k++;
				h[x]++;
				q.add(x);
				p.add(x);
			}
			while(!q.isEmpty()) {
				for(int x:l[q.remove(0)]) {
					if(h[x]<1) {
						h[x]++;
						k++;
						q.add(x);
						p.add(x);
					}
				}
			}
			for(int x:p)v[x]=k;
			k=0;
		}
		System.out.println(Arrays.toString(v));
	}

}
