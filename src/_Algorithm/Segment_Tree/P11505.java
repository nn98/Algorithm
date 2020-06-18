package _Algorithm.Segment_Tree;

import java.util.*;
import java.io.*;

public class P11505 {

	static int n,m,v,i,j,k,p,q,a[];
	static long b[],M=1000000007;
	static void o() {
		int x=i+j-1;
		b[x]=v;
		for(;x>1;x/=2,b[x]=b[x*2]*b[x*2+1]%M);
	}
	static long u(int n,int s,int e,int l,int r) {
		System.out.println(n+" "+s+" "+e+" "+l+" "+r);
		if(l>e|r<s)return 1;
		if(l<=s&e<=r)return b[n];
		int x=(s+e)/2;
		return u(n*2,s,x,l,r)*u(n*2+1,x+1,e,l,r)%M;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());;
		a=new int[n];
		for(i=1;i<n;i*=2);
		j=i;
		b=new long[i*2];
		Arrays.fill(b,1);
		for(i=0;i++<n;v=Integer.parseInt(r.readLine()),o());
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			k=Integer.parseInt(t.nextToken());
			if(k>1)w.write(u(1,0,n-1,Integer.parseInt(t.nextToken()),Integer.parseInt(t.nextToken()))+"\n");
			else {
				i=Integer.parseInt(t.nextToken());
				v=Integer.parseInt(t.nextToken());
				o();
			}
		}
		w.flush();
	}
}