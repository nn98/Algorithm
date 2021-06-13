package _Algorithm.String.KMP;

import java.io.*;
import java.util.Arrays;

public class P9253_2 {

	static char[]a,b,p;
	static int i,j,l,pi[],r[];
	static void g() {
		for(;++i<l;) {
			while(j>0&p[j]!=p[i])j=pi[j-1];
			if(p[j]==p[i])pi[i]=++j;
		}
	}
	
//	KMP
	static void K() {
		
		int h=a.length,s=p.length,be=0,m=0,i=0;
		
		r=new int[h-s+1];
		while(be<=h-s) {
			if(m<s&a[be+m]==p[m]) {
				m++;
				if(m==s)r[i++]=be;
			}else
				if(m==0)be++;
				else {
					be+=(m-pi[m-1]);
					m=pi[m-1];
				}
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
