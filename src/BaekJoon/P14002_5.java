package BaekJoon;

import java.io.*;
import java.util.*;
public class P14002_5{
	static int n,a[],h[],i=0,m=0,s[];
	static void o(int x,int v){
		h[x]=v;
		for(int i=x+1;i<n;i++)
			if(a[i]>a[x]&&h[i]<=v)
				o(i,v+1);
		if(m<h[x])
			m=h[x];
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n+1];
		h=new int[n+1];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		for(i=0;i<n;i++)if(h[i]==0)o(i,1);
		System.out.println(m);
		
		//TODO
		s=new int[m];
		for(i=n;i>=0&&m>0;i--) {
			if(h[i]==m) {
				s[m-1]=a[i];
				m--;
			}
		}
		for(int j:s)
			System.out.print(j+" ");
	}
}