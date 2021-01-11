package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P10999_5 {

	static int n,m,i,j,x,y,l,L[];
	static long a[],b[];
	
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken())+Integer.parseInt(t.nextToken());
		L=new int[n];
		while(i<n)L[i++]=Integer.parseInt(r.readLine());
		l=1;
		for(;l<n;l*=2);
	}

}
