package BaekJoon;

import java.util.Scanner;

public class P1992 {
	static char[][]a;
	static void o(int i,int j,int s) {
		int x=i+s,y=j+s,S=s/2;
		char t=a[i][j];
		boolean c=true;
		for(;i<x&&c;i++) {
			for(;j<y&&c;j++) {
				c=a[i][j]==t;
				System.out.println(i+" "+j+" "+a[i][j]);
			}
		}
		if(c)System.out.print(t);
		else {
			System.out.print("(");
			o(i,j,S);
			o(i,j+S,S);
			o(i+S,j,S);
			o(i+S,j+S,S);
			System.out.print(")");
		}
	}
	public static void main(String[] args) {
//		System.out.println((int)'1');
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		a=new char[n][];
		for(;i<n;a[i++]=s.next().toCharArray());
		o(0,0,n);
	}
}