package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P9461 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=3,a[]=new int[100];
		a[0]=1;
		a[1]=1;
		a[2]=1;
		for(;i<100;a[i++]=a[i-3]+a[i-2]);
		System.out.println(Arrays.toString(a));
		for(;n-->0;) {
			System.out.println(a[s.nextInt()]);
		}
	}

}
