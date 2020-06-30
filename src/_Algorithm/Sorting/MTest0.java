package _Algorithm.Sorting;

import java.util.Scanner;

public class MTest0 {

	static int n,i,j,a[],b[];
	static void o(int s,int e) {
		if(s<e) {
			int m=(s+e)/2;
			o(s,m);
			o(m+1,e);
			m(s,e,m);
		}
	}
	static void m(int s,int e,int m) {
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		b=new int[n];
		for(;i<n;a[i++]=s.nextInt());
	}

}
