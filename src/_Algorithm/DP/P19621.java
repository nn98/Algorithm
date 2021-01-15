package _Algorithm.DP;

import java.util.Arrays;
import java.util.Scanner;

public class P19621 {

	static int n,a[],h[],i;
	static void o(int x,int b) {
		if(x<n-1)o(x+1,b);
		b+=a[x];
		if(x<n-2)
			if(h[x+2]<b)
				o(x+2,b);
		h[x]=h[x]>b?h[x]:b;
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
		System.out.println(Arrays.toString(h));
	}

}
