package _Algorithm.String.KMP;

import java.io.*;
import java.util.Arrays;

// tq

public class P9253_2 {

	static char[]a[]=new char[2][],p;
	static int i,j,l,pi[],r[];
	static void g() {
		for(;++i<l;) {
			while(j>0&p[j]!=p[i])j=pi[j-1];
			if(p[j]==p[i])pi[i]=++j;
		}
	}
	
	static boolean k() {
		int x=0,y=0;
		for(;x<a[i].length;x++) {
			while(y>0&a[i][x]!=p[y])y=pi[y-1];
			if(a[i][x]==p[y])
				if(y==p.length-1)return true;
				else y++;
		}
		return false;
	}
	
	public static void main(String[] args)throws Exception{
		BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
		while(j<2)a[j++]=R.readLine().toCharArray();
		p=R.readLine().toCharArray();
		l=p.length;
		pi=new int[l];
		g();
		i=0;
		boolean r=k();
		i++;
		r=r&k();
		System.out.print(r?"YES":"NO");
	}

}
