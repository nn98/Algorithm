package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14427 {
	static int n,a[],l=1,i,j;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		for(;l<n;l*=2);
		a=new int[l*2];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;a[l+i++]=Integer.parseInt(t.nextToken()));
		System.out.println(Arrays.toString(a));
	}

}
