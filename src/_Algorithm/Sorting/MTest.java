package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MTest {

	static int n,a[],b[],i,j,p,q;
	static void o(int s,int e) {
		System.out.println(s+" "+e);
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
		for(j=p=i=s,q=m;i<e;i++) {
			if(p==m)
				b[i]=a[q++];
			else if(q==e)
				b[i]=a[p++];
			else if(a[p]<a[q])
				b[i]=a[p++];
			else
				b[i]=a[q++];
		}
		for(;j<e;a[j]=b[j++]);
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
