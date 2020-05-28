package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Quick {

	static int n,a[],i,j;
	static void w(int f,int t) {
		int x=a[f];
		a[f]=a[t];
		a[t]=x;
	}
	static void p(int f,int t) {
		int m=(f+t)/2;
		o(f,m,(f+m)/2);
		o(m+1,t,(m+1+t)/2);
	}
	static void o(int f,int t,int m) {
		if((t-f)>2) {
			w(t,m);
			i=f-1;
			j=f;
			for(;j<t;j++) {
				if(a[j]<a[t]) {
					w(j,++i);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		o(0,n-1,n/2);
		System.out.println(Arrays.toString(a));
	}

}
