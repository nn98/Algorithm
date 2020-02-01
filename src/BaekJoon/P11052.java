package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11052 {

	static int n,a[],i=0,r=0;
	static void o(int x,int v,int c) {
		System.out.println(x+" "+v);
		if(c==n)r=r>v?r:v;
		else if(c<n) {
			System.out.println(n/x);
			for(int j=0;j<=n/x;j++)
				o(x+1,v+a[x]*j,c+x*j);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n+1];
		for(;i++<n;a[i]=s.nextInt());
		System.out.println(Arrays.toString(a));
		o(1,0,0);
		System.out.println(r);
	}

}
