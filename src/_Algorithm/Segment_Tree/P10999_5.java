package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P10999_5 {

	static int j,n,m,l,L[];
	static long a[],b[],x,y,i;
	
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	
	static long p(int n,int s,int e) {
		if(y<s|x>e)return 0;
		if(x<=s&e<=y)return a[n]+b[n]==0?0:b[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	
	static void u(int n,int s,int e) {
		System.out.println(n+" "+s+" "+e);
		if(y<s|x>e)return;
		if(s==e)a[n]+=i;
		else if(x<=s&e<=y)b[n]+=i;
		else {
			int m=(s+e)/2;
			u(n*2,s,m);
			u(n*2+1,m+1,e);
		}
		
	}
	
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		String s;
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());
//		L=new int[n];
//		while(i<n)L[i++]=Integer.parseInt(r.readLine());
		l=1;
		for(;l<n;l*=2);
		a=new long[l*2];
		b=new long[l*2];
		for(;i<n;j=l+(int)i++,a[j]=Integer.parseInt(r.readLine()),o());
		System.out.println(Arrays.toString(a));
		while(m-->0) {
			t=new StringTokenizer(r.readLine());
			s=t.nextToken();
			x=Integer.parseInt(t.nextToken());
			y=Integer.parseInt(t.nextToken());
			if(s.equals("1")) {
				i=Integer.parseInt(t.nextToken());
				u(1,1,l);
				System.out.println(Arrays.toString(a));
				System.out.println(Arrays.toString(b));
			}else {
				System.out.println(p(1,1,l));
			}
		}
	}

}
