package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P14579 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		int ;
//		System.out.println(v);
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[m-n+1],i=0;
		a[0]=n%2==0?(1+n)*(n/2):(1+n)*(n/2)+(n/2+1);
		for(;i++<=m-n;a[i]=a[i-1]+(++n));
		System.out.println(Arrays.toString(a));
	}
}