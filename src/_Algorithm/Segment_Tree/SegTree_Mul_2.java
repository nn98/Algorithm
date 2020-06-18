package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class SegTree_Mul_2 {
	static int n,m,i,j,a[],t[],p,q;
	static int o(int n,int s,int e) {
		if(s==e)return t[n]=a[s];
		int m=(s+e)/2;
		return t[n]=o(n*2,s,m)*o(n*2+1,m+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		for(i=1;i<n;i*=2);
		i*=2;
		t=new int[i];
		o(1,0,n-1);
		j=2;
		System.out.println(Arrays.toString(t));
		for(;m<i-1;j*=2,m--)
			for(;m<j;System.out.print(++m!=j?(t[m]+" "):"\n"));
	}

}