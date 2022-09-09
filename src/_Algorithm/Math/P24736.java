package _Algorithm.Math;

import java.util.Scanner;

public class P24736 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,j,u=0,a[]= {6,3,2,1,2};
		for(;i<10;) {
			u+=s.nextInt()*a[i++%5];
			if(i%5==0) {
				System.out.println(u);
				u=0;
			}
		}
	}

}
