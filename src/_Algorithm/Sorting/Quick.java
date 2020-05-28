package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Quick {

	static int n,a[],i,j;
	static void w(int f,int t) {
		System.out.println(8);
		int x=a[f];
		a[f]=a[t];
		a[t]=x;
	}
	static void o(int f,int t) {
		if(f<t) {
			int m=(f+t)/2;
			p(f,m,(f+m)/2);
			p(m+1,t,(m+1+t)/2);
		}
	}
	static void p(int f,int t,int m) {
		w(t,m);
		i=f-1;
		j=f;
		System.out.println(j+" "+t);
		for(;j<t;j++) {
			if(a[j]<a[t]) {
				w(j,++i);
			}
		}
		w(i+1,t);

	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		p(0,n-1,n/2);
		System.out.println(Arrays.toString(a));
	}

}
