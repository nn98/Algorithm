package _Algorithm.Divide_Conquer;

import java.util.Scanner;

public class P2042_2 {

	static int n,m,i,x,d;
	static long[]a,t; 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt()+s.nextInt();
		a=new long[n];
		for(;i<n;a[i++]=s.nextLong());
		for(i=1;i<n;i*=2);
		i*=2;
		System.out.println(i);
		t=new long[i];
	}

}
