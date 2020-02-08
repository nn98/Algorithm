package BaekJoon;

import java.util.Scanner;

public class P1992 {
	static char[][]a;
	static void o(int i,int j,int s) {
		int x=i+s,y=j+s;
		char t=a[i][j];
		boolean c=true;
		for(;i<x&&c;i++)
			for(;j<y&&c;j++)
				c=a[i][j]==t;
		if(c)System.out.print(t);
		else {
			System.out.print("(");
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