package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P14428_2 {
	static int n,m,i,j,l,a[],b[];
	static void o() {
		for(;j>1;j/=2,a[j]=b[a[j*2]]>b[a[j*2+1]]?a[j*2+1]:a[j*2]);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(l=1;l<n;l*=2);
		a=new int[l*2];
		b=new int[l];
		Arrays.fill(b,Integer.MAX_VALUE);
		for(;i<n;j=i+l,b[i]=Integer.parseInt(t.nextToken()),a[j]=i++,o());
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
