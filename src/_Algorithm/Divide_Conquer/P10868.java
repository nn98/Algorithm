package _Algorithm.Divide_Conquer;

import java.util.Arrays;
import java.util.Scanner;

public class P10868 {

	static int n,m,i,j,a[],t[];
	static int o(int n,int s,int e) {
		if(s==e)return t[n]=a[s];
		int m=(s+e)/2,i=o(n*2,s,m),j=o(n*2+1,m+1,e);
		return t[n]=i<j?i:j;
	}
	static int p(int n,int s,int e) {
		if(i>e|j<s)return Integer.MAX_VALUE;
		return 0;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();m=s.nextInt();
		a=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		for(i=1;i<n;i*=2);
		i*=2;
		t=new int[i];
		o(1,0,--n);
		for(;m-->0;) {
			i=s.nextInt();
			j=s.nextInt();
		}
	}

}
