package _Algorithm.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class P14246_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],t[],l=1,i=0,j,r=0;
		for(;l<=n;l*=2);
		t=new int[l];
		l/=2;
		for(;i<n;t[l+i++]=s.nextInt());
		System.out.println(Arrays.toString(t));
	}

}
