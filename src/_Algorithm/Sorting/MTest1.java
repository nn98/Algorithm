package _Algorithm.Sorting;

import java.util.Arrays;
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
		System.out.println("\t"+s+" "+e+" "+m);
		System.out.println("\t"+Arrays.toString(a));
		i=s;
		j=m;
		p=q=0;
		while(!(i<m&&j<e)) {
			if(i==m)b[p]=a[j++];
			else if(j==e)b[p]=a[i++];
			else b[p]=a[i]<a[j]?a[i++]:a[j++];
			p++;
		}
		System.out.println("b\t"+Arrays.toString(b));
		while(s<e)a[s++]=b[q++];
		System.out.println("\t"+Arrays.toString(a));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		b=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		System.out.println(Arrays.toString(a));
		o(0,n);
		System.out.println(Arrays.toString(a));
	}

}
