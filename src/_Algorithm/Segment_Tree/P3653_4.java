package _Algorithm.Segment_Tree;
// À¸¾Æ¾Ç ½Ã¹ß

import java.util.*;
import java.io.*;

public class P3653_4 {
	static int n,m,i,j,t[],x,l,r,a,b,q[],p;
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	static int u(int n,int s,int e) {
		if(r<s||e<l)return 0;
		if(l<=s&&e<=r)return t[n];
		int m=(s+e)/2;
		return u(n*2,s,m)+u(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter W=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(R.readLine());
		for(;n-->0;) {
			StringTokenizer T=new StringTokenizer(R.readLine());
			a=Integer.parseInt(T.nextToken());
			b=Integer.parseInt(T.nextToken());
			for(i=1;i<a+b;i*=2);
			j=i;
			q=new int[a];
			t=new int[i*2];
			m=0;
			for(i=b;i<a+b;x=j+i++,t[x]=1,o(),q[m]=b+m++);
			T=new StringTokenizer(R.readLine());
			for(i=0;i++<b;) {
				m=Integer.parseInt(T.nextToken())-1;
				p=r=q[m];
				r--;
				W.write(u(1,0,j-1)+" ");
				t[j+p]=0;
				q[m]=b-i;
				t[j+q[m]]=1;
				x=j+p;
				o();
				x=j+q[m];
				o();
			}
			W.newLine();
		}
		W.flush();
	}
}