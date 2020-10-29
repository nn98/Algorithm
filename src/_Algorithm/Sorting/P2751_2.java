package _Algorithm.Sorting;

import java.io.*;

public class P2751_2 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),m=2000001,v=1000000,a[]=new int[m];
		while(n-->0)
			a[Integer.parseInt(r.readLine())+v]++;
		while(++n<m)
			if(a[n]>0)System.out.println(n-v);
	}

}
