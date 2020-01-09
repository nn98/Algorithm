package BaekJoon;

import java.util.*;
public class P9507_2{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=1,j;
		long[]a=new long[68];
		a[i]=a[0]=1;
		for(;i++<67;) {
			j=i-1;
			a[i]=a[j];
			for(;j>0&&j>i-4;a[i]=a[i]+a[--j]);
		}
		for(;n-->0;)System.out.println(a[s.nextInt()]);
	}
}