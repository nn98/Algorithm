package BaekJoon;

import java.io.*;
import java.util.*;
public class P14501{
	static int n,a[],b[],h[],i=0,p=0;
	static void o(int x,int v) {
		h[x]=b[x]+v;
		if(x+a[x]>n)h[x]-=b[x];
		for(int i=x+a[x];i<n;i++) {
			if(h[i]<=v+b[x])
				o(i,v+b[x]);
		}
		p=p>h[x]?p:h[x];
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		b=new int[n];
		h=new int[n];
		for(;i<n;i++) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			a[i]=Integer.parseInt(t.nextToken());
			b[i]=Integer.parseInt(t.nextToken());
		}
		for(i=0;i<n;i++)if(h[i]==0)o(i,0);
		System.out.println(Arrays.toString(h));
		System.out.print(p);
	}
}