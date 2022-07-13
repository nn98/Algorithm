package _Algorithm.DP;

import java.util.Scanner;

public class P12355 {
	static int n,m,i,j,a[],r;
	static void o(int x,int v) {
		System.out.println(x+" "+v);
		r=r>v?r:v;
		for(int i=x;++i<m;)if(a[i]>a[x])o(i,v+1);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(;i++<n;) {
			m=s.nextInt();
			a=new int[m];
			r=0;
			for(j=0;j<m;a[j++]=s.nextInt());
			for(;j-->0;o(j,1));
			System.out.println("Case #"+i+": "+(m-r));
		}
	}

}
