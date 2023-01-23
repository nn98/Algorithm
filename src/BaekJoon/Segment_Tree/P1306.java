package BaekJoon.Segment_Tree;

import java.io.*;
import java.util.*;

public class P1306 {

	static int n,m,i,j,x,y,l,p,q,a[],u,v;
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]>a[j*2+1]?a[j*2]:a[j*2+1]);
	}
	static int p(int n,int s,int e) {
		if(e<x|y<s)return 0;
		if(s>=x&e<=y)return a[n];
		int m=(s+e)/2,a=p(n*2,s,m),b=p(n*2+1,m+1,e);
		return a>b?a:b;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())-1;
		t=new StringTokenizer(r.readLine());
		l=1;
		for(;l<=n;l*=2);
		a=new int[l*2];
		for(;i<n;j=i+++l,a[j]=Integer.parseInt(t.nextToken()),o());
		for(i=m;i<n-m;i++) {
			x=i-m+1;
			y=i+m+1;
			w.write(p(1,1,l)+" ");
		}
		w.flush();
	}

}
