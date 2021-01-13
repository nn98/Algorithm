package _Algorithm.Segment_Tree;

// 원트
// 기본 세그먼트 트리는 ㄱㅊ

import java.io.*;
import java.util.*;

public class P1275 {

	static int n,m,i,j,l;
	static long a[];
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	static long p(int n,int s,int e) {
		if(s>j|e<i)return 0;
		if(i<=s&j>=e)return a[n];
		int m=(s+e)/2;
		return p(n*2,s,m)+p(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		t=new StringTokenizer(r.readLine());
		for(l=1;l<n;l*=2);
		a=new long[l*2];
		for(;i<n;j=i+++l,a[j]=Integer.parseInt(t.nextToken()),o());
		while(m-->0) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			if(i>j) {
				n=i;
				i=j;
				j=n;
			}
			w.write(p(1,1,l)+"\n");
			j=Integer.parseInt(t.nextToken())+l-1;
			a[j]=Integer.parseInt(t.nextToken());
			o();
		}
		w.flush();
	}

}
