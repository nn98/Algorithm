package _Algorithm.Segment_Tree;

import java.util.*;
import java.io.*;

public class P11505 {

	static int n,m,v,i,j,k,p,q,a[];
	static long b[];
	static void o() {
		int x=i+j-1;
		b[x]=v;
		for(;x>1;x/=2,b[x]=b[x*2]*b[x*2+1]);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());;
		a=new int[n];
		for(;i<n;a[i++]=Integer.parseInt(r.readLine()));
		for(i=1;i<n;i*=2);
		j=i;
		b=new long[i*2];
		Arrays.fill(b,1);
		for(i=0;i++<n;v=a[i-1],o());
		System.out.println(Arrays.toString(b));
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
		}
	}

}
