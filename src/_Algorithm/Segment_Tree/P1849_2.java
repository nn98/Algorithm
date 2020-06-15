package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class P1849_2 {
	static int n,m,i,j,a[],t[],x;
	static void u() {
		x=j+i-1;
		t[x]=m;
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n+1];
		for(i=1;i<n*2;i*=2);
		t=new int[i];
		j=i/2;
		m=1;
		for(i=0;i++<n;)u();
		System.out.println(Arrays.toString(t));
	}
}
