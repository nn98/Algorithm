package _Algorithm.DP;

import java.util.Arrays;
import java.util.Scanner;

// ±¦È÷ sum³Ö°í Áö¶ö

public class P19621 {

	static int n,a[],h[],i,m;
	static void o(int x,int b) {
//		System.out.println(x+" "+b);
//		if(x<n-1)o(x+1,b);
//		b+=a[x];
//		if(x<n-2)
//			if(h[x+2]<b)
//				o(x+2,b);
//		h[x]=h[x]>b?h[x]:b;
//		m=m>h[x]?m:h[x];
		if(x>=n)m=m>b?m:b;
		else {
			o(x+1,b);
			o(x+2,b+a[x]);
		}
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
		o(0,0);
		System.out.println(m);
	}

}
