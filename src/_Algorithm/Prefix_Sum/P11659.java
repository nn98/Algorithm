package _Algorithm.Prefix_Sum;

import java.io.*;
import java.util.*;

public class P11659 {
	static int n,m,l=1,a[],i,j;
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	static int p(int n,int s,int e) {
		if(s>j|i>e)return 0;
		if(i<=s&e<=j)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		for(;l<n;l*=2);
		a=new int[l*2];
		t=new StringTokenizer(r.readLine());
		for(;i<n;j=i+++l,a[j]=Integer.parseInt(t.nextToken()),o());
		System.out.println(Arrays.toString(a));
		i=1;
		j=l;
		for(;m-->0;t=new StringTokenizer(r.readLine()),System.out.println(p(1,Integer.parseInt(t.nextToken())-1,Integer.parseInt(t.nextToken())-1)));
	}

}
