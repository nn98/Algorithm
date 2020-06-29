package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P1377_3 {

	static int n,i,j,a[],b[][],t,m;
	static void w(int i,int j) {
		t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	static void o(int s,int e) {
		if(s<e) {
			System.out.println(s+" "+e);
			p(s,e);
			o(s,j);
			o(j+2,e);
		}
	}
	static void p(int s,int e) {
		m=(s+e)/2;
		w(m,e);
		n=a[e];
		j=s-1;
		for(;s<e;s++)if(a[s]<n)w(++j,s);
		w(j+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		b=new int[2][n];
		for(;i<n;a[i]=b[0][i]=s.nextInt(),b[1][i]=i++);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));
		o(0,n-1);
		System.out.println(Arrays.toString(a));
	}

}
