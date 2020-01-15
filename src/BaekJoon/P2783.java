package BaekJoon;

import java.util.Scanner;

public class P2783 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double p=s.nextDouble(),v=s.nextDouble(),i=0,j=s.nextInt(),r=0;
		for(;i++<j;) {
			if(i==1)r=1000/v*p;
			p=s.nextDouble();
			v=s.nextDouble();
			r=r<1000/v*p?r:1000/v*p;;
		}
		System.out.printf("%.2f",r);
	}
}