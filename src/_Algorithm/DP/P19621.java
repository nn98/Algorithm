package _Algorithm.DP;

import java.util.Scanner;

public class P19621 {

	static int n,a[],h[],i;
	static void o(int x,int b) {
		h[x]=b;
		o(x+1,b);
		if(h[x+2]<b+a[x])
			o(x+2,b+a[x]);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		h=new int[n];
		while(i<n) {
			s.next();
			s.next();
			a[i++]=s.nextInt();
		}
		for(i=0;i<n;o(i++,0));
	}

}
