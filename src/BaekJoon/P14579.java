package BaekJoon;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class P14579 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		int ;
//		System.out.println(v);
//		System.out.println(Arrays.toString(a));
//		int n=s.nextInt(),m=s.nextInt(),a[]=new int[m-n+1],i=0;
//		a[0]=n%2==0?(1+n)*(n/2):(1+n)*(n/2)+(n/2+1);
//		for(;i++<=m-n;a[i]=a[i-1]+(++n));
		int n=s.nextInt(),m=s.nextInt(),a[]=new int[m-n+1],i=0;
		
		a[0]=n%2==0?(1+n)*(n/2):(1+n)*(n/2)+(n/2+1);
		BigInteger r=new BigInteger(""+a[0]);
		for(;i++<=m-n;a[i]=a[i-1]+(++n),r=r.multiply(new BigInteger(""+a[i])));
		System.out.print(r.mod(new BigInteger("14579")));
	}
}