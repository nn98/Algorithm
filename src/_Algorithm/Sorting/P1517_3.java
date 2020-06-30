package _Algorithm.Sorting;

import java.util.Scanner;

public class P1517_3 {

	static int n,i,j,p,q,a[],b[],c;
	static long r=0;
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
		c=p=q=0;
		while(i<m|j<e) {
			if(i==m) {
				b[p]=a[j++];
				c++;
			}
			else if(j==e) {
				b[p]=a[i++];
				r+=c;
			}
			else {
				if(a[i]<a[j]) {
					b[p]=a[i++];
					r+=c;
				}else {
					b[p]=a[j++];
					c++;
				}
			}
			p++;
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
		System.out.println(r);
	}

}