package BaekJoon.BFS;

import java.util.Arrays;

public class P1697 {
	static String[]a=new java.util.Scanner(System.in).nextLine().split(" ");
	static int n=Integer.parseInt(a[0]),m=Integer.parseInt(a[1]),l=100001,b[]=new int[l],N=Integer.MAX_VALUE;
	static void o(int x,int v) {
//		System.out.println(x+" "+v);
		if(x==m)N=v;
		b[x]=v;
		//		System.out.println(Arrays.toString(b));
		v++;
		if(v<=N) {
			int X=x*2;
			if(x<m)if(X<l&X<=l)if(b[X]>v|b[X]<0)o(X,v);
			X=x+1;
			if(x<m)if(X<l&X<=l)if(b[X]>v|b[X]<0)o(X,v);
			X=x-1;
			if(X>0&X<=l)if(b[X]>v|b[X]<0)o(X,v);
		}
	}
	public static void main(String[] args) {
		Arrays.fill(b,-1);
		o(n,0);
		//		System.out.println(Arrays.toString(b));
		System.out.println(b[m]);
	}

}
