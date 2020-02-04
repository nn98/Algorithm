package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P14501_2 {
	static int n,a[],b[],h[],i,r;
	static void o(int x) {
		if(x+a[x]>n)return;
		else if(x+a[x]==n||x+a[x]+a[x+a[x]]>n)h[x]=b[x];
		else {
			int v=0,X=x;
			x+=a[x];
			for(;x<n;x++) {
				v=v>h[x]?v:h[x];
			}
			h[X]=v+b[X];
		}
		r=r>h[X]?r:h[X];
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		b=new int[n];
		h=new int[n];
		for(;i<n;a[i]=s.nextInt(),b[i++]=s.nextInt());
		for(;i-->0;o(i));
		System.out.print(r);
		System.out.println(Arrays.toString(h));
	}
}