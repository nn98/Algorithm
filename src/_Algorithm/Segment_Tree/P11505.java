package _Algorithm.Segment_Tree;

import java.util.*;
import java.io.*;

public class P11505 {

	static int n,m,i,j,k,p,q,a[];
	static long b[];
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
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
		}
	}

}
