package _Algorithm.String.KMP;

import java.io.*;
import java.util.Arrays;

public class KMP_2 {

	static char[]s,p;
	static int i,j,pi[],S,P;
	static void g() {
		for(;++i<P;) {
			while(j>0&p[i]!=p[j])j=pi[j-1];
			if(p[i]==p[j])pi[i]=++j;
		}
	}
	
	static void K() {
		int i=0,j=0,a[];
		for(;i<S;i++) {
			while(j>0&s[i]!=p[j])j=pi[j-1];
			if(s[i]==p[j]) {
				/*Searching*/
				if(j==P-1) {
					j=pi[j];
				}else j++;
			}
		}
	}
	public static void main(String[] args)throws Exception{
		
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		s=r.readLine().toCharArray();
		p=r.readLine().toCharArray();
		S=s.length;
		P=p.length;
		pi=new int[P];
		g();
		
		System.out.println(Arrays.toString(pi));
	}

}
