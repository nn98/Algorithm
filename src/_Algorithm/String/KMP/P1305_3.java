package _Algorithm.String.KMP;

import java.util.Scanner;

public class P1305_3 {

	static int n,i,j,b[];
	static char[]a;
	static void o() {
		b=new int[n];
		for(;i<n;) {
			i++;
			while(j>0&a[i]!=a[j])j=b[j];
			if(a[i]==a[j]) {
				b[i]=++j;
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=s.next().toCharArray();
		
	}

}
