package BaekJoon.BFS;

import java.util.Arrays;

/* 66-100 -> 34|32 / 67-100 -> 33|34
 * b-a > a*2-b 일때만 * 2하고 
 * 크기는 2배? 어케해야 더 줄일수있으려나
 * 아시발 지금제출하지말건애ㅑㄹㅋ농랮ㄷ래ㅑㅈ
 */

public class P13549 {
	static String[]a=new java.util.Scanner(System.in).nextLine().split(" ");
	static int n=Integer.parseInt(a[0]),m=Integer.parseInt(a[1]),l=100001,b[]=new int[l];
	static void o(int x,int v) {
		b[x]=v;
//		System.out.println(Arrays.toString(b));
		int X=x*2;
		if(X<l&X<=m)if(b[x*2]>v|b[X]<0)o(x*2,v);
		X=x+1;
		v++;
		if(X<l&X<=m)if(b[X]>v|b[X]<0)o(X,v);
		X=x-1;
		if(X>=0&X<=m)if(b[X]>v|b[X]<0)o(X,v);
	}
	public static void main(String[] args) {
		Arrays.fill(b,-1);
		o(n,0);
		System.out.println(Arrays.toString(b));
		System.out.println(b[m]);
	}

}
