package _Algorithm.DFS;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P13023 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		int n=Integer.parseInt(t.nextToken()),m=Integer.parseInt(t.nextToken()),a[]=new int[n],b,c,d=0;
		while(m-->0) {
			t=new StringTokenizer(r.readLine());
			b=Integer.parseInt(t.nextToken());
			c=Integer.parseInt(t.nextToken());
			a[b]=a[c]=Math.max(a[b],a[c])+1;
			d=d>a[b]?d:a[b];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(d>4?1:0);
	}

}
