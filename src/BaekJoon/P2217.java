package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;
//Simple is Best
//Two T
public class P2217 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,v,r;
		for(;i<n;a[i++]=s.nextInt());
		Arrays.sort(a);
		v=r=a[--i];
		for(;--i>=0;) {
			v=a[i]*(n-i);
			r=v>r?v:r;
		}
		System.out.println(r);
	}
}