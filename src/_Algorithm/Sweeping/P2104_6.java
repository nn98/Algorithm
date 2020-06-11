package _Algorithm.Sweeping;

import java.util.Arrays;
import java.util.Scanner;

public class P2104_6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,a[],b[],m,i=0,j;
		long u[],v,w=0;
		a=new int[n+1];
		b=new int[n];
		u=new long[n];
		for(;++i<n;b[i]=b[i-1]+(a[i]=s.nextInt()));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

}
