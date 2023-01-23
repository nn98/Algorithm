package BaekJoon.Segment_Tree;

import java.io.*;
import java.util.StringTokenizer;
public class P2042_5 {

	static int n,m,i,j,l;
	static long a[],b;
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	static long p(int n,int s,int e) {
		if(s>j|e<i)return 0;
		if(i<=s&e<=j)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());
		for(l=1;l<n;l*=2);
		a=new long[l*2];
		for(;i<n;) {
			j=l+i++;
			a[j]=Long.parseLong(r.readLine());
			if(i%2==0|i==n)o();
		}
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			n=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			b=Long.parseLong(t.nextToken());
			switch(n) {
			case 1:
				j=i+l-1;
				a[j]=b;
				o();
				break;
			case 2:
				j=(int)b;
				w.write(p(1,1,l)+"\n");
			}
		}
		w.flush();
	}
}