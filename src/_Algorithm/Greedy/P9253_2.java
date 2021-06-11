package _Algorithm.Greedy;

import java.io.*;
import java.util.Arrays;

public class P9253_2 {

	static char[]a,b,p;
	static int i,j,l,pi[];
	static void g() {
		for(;i<l;i++) {
			while(j>0&p[j]!=p[i])j=pi[j-1];
			if(p[j]==p[i])pi[j]=++j;
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		a=r.readLine().toCharArray();
		b=r.readLine().toCharArray();
		p=r.readLine().toCharArray();
		l=p.length;
		pi=new int[l];
		g();
		System.out.println(Arrays.toString(pi));
	}

}
