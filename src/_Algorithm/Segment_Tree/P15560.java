package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class P15560 {

	static int n,m,l,i,j,u,v,a[];
	static void o() {
		for(;j>1;j/=2,a[j]=a[j*2]+a[j*2+1]);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		u=s.nextInt();
		v=s.nextInt();
		for(l=1;l<n;l*=2);
		a=new int[l*2];
		for(;i<n;j=l+i++,a[j]=s.nextInt(),o());
		System.out.println(Arrays.toString(a));
		for(;m-->0;) {
			
		}
	}

}
