package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2668 {
	static int n,a[],h[],i=1,r=0;
	static boolean[][]l;
	static void o(int x,int c,StringBuffer b) {
//		System.out.println(x+" "+c+" "+O);
		StringBuffer B=new StringBuffer(b.append(x+" "));
		if(c>n)return;
		if(a[x]==b.charAt(0)-'0') {
			for(String s:b.toString().split(" "))
				h[Integer.parseInt(s)]=1;
		}
		else o(a[x],c+1,B);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		a=new int[n];
		h=new int[n];
		l=new boolean[n][n];
		for(;i<n;a[i++]=s.nextInt());
		for(i=1;i<n;o(i++,0,new StringBuffer()));
		StringBuffer b=new StringBuffer();
		for(i=1;i<n;i++)if(h[i]==1) {
			r++;
			b.append(i+"\n");
		}
//		System.out.print(Arrays.toString(h));
		System.out.print(r+"\n"+b);
	}
}