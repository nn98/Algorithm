package _Algorithm;

import java.util.Scanner;

public class Gcf_Lcm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),i=a,j=b,k;
		while(j>0) {
			k=i%j;
			i=j;
			j=k;
		}
		System.out.println(i+" "+j);
		System.out.println(j=a*b/i);
		System.out.println(j/a+" "+j/b);
	}

}
