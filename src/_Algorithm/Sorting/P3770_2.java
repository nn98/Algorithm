package _Algorithm.Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P3770_2 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),m=0,e,w,i,p,q,j,a[][];
		long R;
		while(m++<n) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			e=Integer.parseInt(t.nextToken());
			w=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			a=new int[w][e];
			R=0;
			while(i-->0) {
				t=new StringTokenizer(r.readLine());
				p=Integer.parseInt(t.nextToken())-1;
				a[Integer.parseInt(t.nextToken())-1][p]++;
			}
			//			System.out.println(Arrays.toString(a));
			for(i=w;i-->0;) {
				for(j=0;j<e;j++) {
					if(a[i][j]>0) {
						for(p=i;i-->0;) {
							for(q=j;++q<e;R+=a[p][q]>0?1:0);
						}
					}
				}
			}
			System.out.println("Test case "+m+": "+R);
		}
	}
}