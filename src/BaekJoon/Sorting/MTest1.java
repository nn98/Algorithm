package BaekJoon.Sorting;

import java.util.Scanner;

public class MTest1 {

	static int n,i,j,p,q,a[],b[];
	static void o(int s,int e) {
		if(s<e-1) {
			int m=(s+e)/2;
			o(s,m);
			o(m,e);
			m(s,e,m);
		}
	}
	static void m(int s,int e,int m) {
		i=s;
		j=m;
		p=q=0;
		while(i<m|j<e) {
			if(i==m)b[p]=a[j++];
			else if(j==e)b[p]=a[i++];
			else b[p]=a[i]<a[j]?a[i++]:a[j++];
			p++;
		}
		if(s==0&e==n) {
			for(int x:b)System.out.println(x);
		}
		while(s<e)a[s++]=b[q++];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		b=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		o(0,n);
	}

}
