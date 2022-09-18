package _Algorithm.BFS;

import java.util.Arrays;

public class P13549 {
	static String[]a=new java.util.Scanner(System.in).nextLine().split(" ");
	static int n=Integer.parseInt(a[0]),m=Integer.parseInt(a[1]),l=100001,b[]=new int[l];
	static void o(int x,int v) {
		b[x]=v;
		int X=x*2;
		if(X<l)if(b[x*2]>v)o(x*2,v);
		X=x+1;
		v++;
		if(X<l)if(b[x+1]>v)o(x+1,v);
		X=x-1;
		if(X>0)if(b[x-1]>v)o(x-1,v);
	}
	public static void main(String[] args) {
		o(n,0);
		System.out.println(Arrays.toString(b));
		System.out.println(b[m]);
	}

}
