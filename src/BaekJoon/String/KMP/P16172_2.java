package BaekJoon.String.KMP;

import java.util.Scanner;

public class P16172_2 {
	static char[]a,b;
	static int i,j,p[],A,B,r;
	
	static void g() {
		for(;++i<B;) {
			while(j>0&b[i]!=b[j])j=p[j-1];
			if(b[i]==b[j])p[i]=++j;
		}
	}

	static void k() {
		i=j=0;
		for(;i<A&r<1;i++) {
			while(j>0&a[i]!=b[j])j=p[j-1];
			if(j==B-1)r++;
			else j++;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String S=s.next();
		S=S.replaceAll("[0-9]","");
		a=S.toCharArray();
		b=s.next().toCharArray();
		A=a.length;
		B=b.length;
		p=new int[B];
		g();
		k();
		System.out.print(r);
	}

}