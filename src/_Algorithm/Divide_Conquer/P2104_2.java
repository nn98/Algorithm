package BaekJoon;

import java.io.*;
import java.util.*;
public class P2104_2 {
	static int n,i,R,j,k,a;
	static List<List<Integer>>l;
	static void o(int f,int t) {
		if(f==n)return;
		int x=l.get(f).get(f);
		if(t==f)R=R>x*x?R:x*x;
		else if(t>f) {
			int i=f,j=f,m=x,v;
			for(;i++<t;) {
				if(l.get(i).get(i)<m) {
					j=i;
					m=l.get(i).get(i);
				}
			}
			v=l.get(f).get(t)*m;
			R=R>v?R:v;
				o(f,j-1);
				o(j+1,t);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		l=new ArrayList(n);
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;i++) {
			a=Integer.parseInt(t.nextToken());
			l.add(i,new ArrayList(n));
			for(j=0;j<i;l.get(i).add(j++,0));
			if(i==0)l.get(i).add(a);
			else for(j=i;j>=0;l.get(j).add(l.get(j--).get(i-1)+a));
		}
//		for(List b:l)System.out.println(b);
		o(0,n-1);
		System.out.print(R);
	}
}