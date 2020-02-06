package BaekJoon;

import java.util.Scanner;

public class P2293 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),v=s.nextInt(),a[]=new int[n],h[]=new int[v+1],i=0,j,r=0;
		for(;i<n;a[i++]=s.nextInt());
		for(i=0;i<n;i++)for(j=a[i];j<=v;j+=a[i])h[j]++;
	}
}