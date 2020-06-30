package _Algorithm.Sorting;

import java.util.Scanner;

public class MTest0 {

	static int n,i,j,a[],b[],x,y;
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
		x=y=0;
		while(!(i>m&j>e))
			if(i>m)b[x++]=a[j++];
			else if(j>e)b[x++]=a[i++];
			else b[x++]=a[i]<a[j]?a[i++]:a[j++];
			while(s<=e)a[s++]=b[y++];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		b=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		o(0,n-1);
		for(int z:a)System.out.println(z);
	}
}