package BaekJoon.String.KMP;

import java.util.Scanner;

/*
�̻��¿��� 
1q2w3e4r5t6y
qwerty
== 1 ����
??
 */
public class P16172 {
	
	static char[]a,b;
	static int i,j,p[],A,B;
	
	static void g() {
		for(;++i<B;) {
			while(j>0&b[i]!=b[j])j=p[j-1];
			if(b[i]==b[j])p[i]=++j;
		}
	}

	static void k() {
		i=j=0;
		for(;i<A;i++) {
			while(j>0&a[i]!=b[j])j=p[j-1];
			if(j==B-1)return;
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
		g();
		k();
		System.out.print(j==B-1?1:0);
	}

}
