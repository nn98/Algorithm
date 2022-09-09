package _Algorithm.Math;

import java.util.Arrays;
import java.util.Scanner;

public class P15921 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,a[]=new int[n],b[]=new int[101];
		double u=0,r=0;
		if(n>0) {
			for(;i<n;u+=a[i]=s.nextInt(),b[a[i++]]++);
			u/=n;
			//			System.out.println(Arrays.toString(a));
			//			System.out.println(Arrays.toString(b));
			for(i=0;i<n;r+=a[i]*((double)b[a[i]]/n),b[a[i++]]=0);//,System.out.println(r)
			//			System.out.println(u);
			//			System.out.println(r);
			n=r==0?0:n;
		}
		System.out.print(n==0?"divide by zero":String.format("%.2f",u/r));
	}

}
