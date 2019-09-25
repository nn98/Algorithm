package BaekJoon;

import java.util.Scanner;

public class P9411_T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1300.123456789-1300.1+0.0000000012345678912345);
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		s.nextLine();
		for(int i=0;i<N;i++) {
			double j=-1,sum=0;
			while(!(j==0)) {
				j=s.nextDouble();
				sum+=j;
			}
			System.out.println(sum);
			
		}
	}

}
