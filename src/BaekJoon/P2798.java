package BaekJoon;

import java.util.Scanner;

public class P2798 {
	static int n,m,a[],r,i;
	static void o(int x,int v,int c) {
		if(c>2)return;
		if(v>m)return;
		if(r==m)return;
		if(x==n)r=r>v?r:v;
		else {
		o(x+1,v+a[x],c+1);
		o(x+1,v,c);
		}
	}
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		o(0,0,0);
		System.out.print(r);
	}
}
