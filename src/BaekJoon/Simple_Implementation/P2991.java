package BaekJoon.Simple_Implementation;

import java.util.Scanner;

public class P2991 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),d=s.nextInt(),p=s.nextInt(),
				m=s.nextInt(),n=s.nextInt(),i=0,j=0,l=1000,x[]=new int[l],k;
		for(;i<l|j<l;) {
			for(k=0;k<a&k+i<l;x[k+++i]++);
			i+=k+b;
//			System.out.println(i);
			for(k=0;k<c&k+j<l;x[k+++j]++);
			j+=k+d;
//			System.out.println(j);
		}
//		System.out.println(Arrays.toString(x));
		System.out.println(x[p-1]);
		System.out.println(x[m-1]);
		System.out.println(x[n-1]);
	}

}
