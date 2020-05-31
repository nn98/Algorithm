package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Heap_Min {
	
	static int n,s,l,r,t,i,a[];
	static void o() {
		b();
		for(;n>=1;) {
			w(0,n--);
			h(0);
		}
	}
	static void b() {
		for(i=(n-1)/2;i>=0;i--)h(i);
	}
	static void h(int x) {
		l=x*2+1;
		r=x*2+2;
		if(r<=n)s=a[l]<a[r]?l:r;
		else if(l<=n)s=l;
		else return;
		if(a[x]>a[s]) {
			w(x,s);
			h(s);
		}
	}
	static void w(int x,int y) {
		t=a[x];
		a[x]=a[y];
		a[y]=t;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		n=s.nextInt();
//		while(S-1<n)S*=2;
//		System.out.println(--S);
//		a=new int[S];
		a=new int[n=s.nextInt()];
		for(;l<n;a[l++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		n--;
		o();
		System.out.println(Arrays.toString(a));
//		b();
//		System.out.println(Arrays.toString(a));
	}
}