package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class P2042_5 {

	static int n,m,i,j,l;
	static long a[];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());
		for(l=1;l<n;l*=2);
		a=new long[l*2];
		for(;i<n;a[l+i++]=Integer.parseInt(r.readLine()));
//		System.out.println(Arrays.toString(a));
	}

}
