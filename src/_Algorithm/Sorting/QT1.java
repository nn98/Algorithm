package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QT1 {
// 시벌 내코드를 내가 이해를 몬하노
	static int n,a[],i,j;
	static void w(int i,int j) {
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	static void o(int s,int e) {
		if(s<e) {
			p(s,e);
			o(s,i);
			o(i+2,e);
		}
	}
	static void p(int s,int e) {
		w((s+e)/2,e);
		i=s-1;
		for(;s<e;s++)
			if(a[s]<a[e])
				w(++i,s);
		w(i+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		o(0,n-1);
		System.out.println(Arrays.toString(a));
	}

}
