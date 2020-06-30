package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MTest2 {

	static int n,i,j,p,q,a[],b[],c;
	static long r=0;
	static void o(int s,int e) {
		if(s<e) {
			int m=(s+e)/2;
			o(s,m);
			o(m+1,e);
			m(s,e,m);
		}
	}
	static void m(int s,int e,int m) {
		i=s;
		j=m+1;
		p=q=c=0;
		while(i<=m|j<=e) {
			if(i>m) {
				b[p]=a[j++];
				c++;
			}else if(j>e) {
				b[p]=a[i++];
				r+=c;
			}else if(a[i]<a[j]) {
				b[p]=a[i++];
				r+=c;
			}else if(a[j]<a[i]) {
				b[p]=a[j++];
				c++;
			}
			p++;
		}
		while(s<=e)a[s++]=b[q++];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		b=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		o(0,n-1);
		System.out.println(r);
	}

}
