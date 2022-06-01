package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P14248 {

	static int n,m,i,j,a[],h[];
	static void o(int x) {
		m++;
		h[x]++;
		int X=x-a[x],Y=x+a[x];
		if(X>=0)if(h[X]<1)o(X);
		if(Y<n)if(h[Y]<1)o(Y);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		h=new int[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		o(Integer.parseInt(r.readLine())-1);
		System.out.println(m);
	}

}
