package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1325_4 {
	static List<Integer>q=new ArrayList(),l[],p=new ArrayList();
	static int n,m,i,k,j,h[],v[];
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
//			l[i].add(j);
			l[j].add(i);
		}
		for(List L:l) {
			System.out.println(L.toString());
		}
		for(i=0;++i<n;) {
			k=1;
			h[i]++;
			q.add(i);
			for(int x:l[i]) {
				k++;
				h[x]++;
				q.add(x);
				p.add(x);
			}
			System.out.println("q: "+q+"\tk: "+k);
			while(!q.isEmpty()) {
				j=q.remove(0);
				System.out.println("at-"+j);
				for(int x:l[j]) {
					System.out.println("\tin-"+x);
					if(h[x]<1) {
						h[x]++;
						k++;
						q.add(x);
						p.add(x);
					}
				}
			}
			System.out.println(Arrays.toString(h)+" "+k);
			for(int x:p)v[x]=k;
			System.out.println(Arrays.toString(v));
		}
		System.out.println(Arrays.toString(v));
	}

}
