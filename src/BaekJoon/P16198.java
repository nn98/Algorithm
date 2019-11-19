package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P16198 {

	static int n,a[],h[],i=0,r=0,m=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		h=new int[n];
		for(;i<n;a[i]=s.nextInt(),m=a[m]>a[i++]?m:i-1);
		System.out.println(a[m]+" "+m);
	}

}
