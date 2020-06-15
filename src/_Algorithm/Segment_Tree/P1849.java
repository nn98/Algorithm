package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class P1849 {

	static int n,a[],t[],i,j,m;
	static int o(int n,int s,int e) {
		if(s==e)return t[n]=a[s];
		int m=(s+e)/2;
		return o(n*2,s,m)+o(n*2+1,m+1,e);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=1);
		for(i=1;i<n;i*=2);
		i*=2;
		t=new int[i];
		o(1,0,n-1);
		System.out.println(Arrays.toString(t));
	}

}
