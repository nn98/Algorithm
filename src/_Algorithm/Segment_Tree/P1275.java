package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P1275 {

	static int n,m,i,j,l;
	static long a[];
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
//	static long p(int n,int s,int e) {
//		
//	}
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
		System.out.println(Arrays.toString(a));
	}

}
