package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class SegTree_Mul_2 {
	static int n,m,i,j,a[],t[],p,q;
	static void o() {
		int x=j+p-1;
		t[x]=m;
		for(;x>1;x/=2,t[x]=t[x*2]*t[x*2+1]);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		for(i=1;i<n;i*=2);
		j=i;
		i*=2;
		t=new int[i];
		for(;p++<n;m=a[p-1],o());
		j=2;
		System.out.println(Arrays.toString(t));
		for(;m<i-1;j*=2,m--)
			for(;m<j;System.out.print(++m!=j?(t[m]+" "):"\n"));
	}

}