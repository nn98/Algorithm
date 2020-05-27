package _Algorithm.Sorting;

import java.io.*;
import java.util.*;
public class P1516_4 {

	static int n,m,v[],c[],i,j;
	static List<Integer>[]l;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine())+1;
		v=new int[n];
		c=new int[n];
		l=new List[n];
		for(;++i<n;l[i]=new ArrayList());
		for(i=0;++i<n;) {
			j=0;
			StringTokenizer t=new StringTokenizer(r.readLine());
			while((m=Integer.parseInt(t.nextToken()))>=0) {
				if(j==0)v[i]=m;
				else {
					l[i].add(Integer.parseInt(t.nextToken()));
					c[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(v));
		System.out.println(Arrays.toString(c));
		for(i=0;++i<n;System.out.println(l[i].toString()));
		
		
		
	}

}
