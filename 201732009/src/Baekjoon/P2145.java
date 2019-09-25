package Baekjoon;

import java.util.Scanner;

public class P2145 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n!=0) {
			while(!(n<10)) {
				int sum=0;
//				System.out.println(n);
				for(int i=1;i<=n;i*=10) {
					sum+=n%(i*10)/i;
				}
				n=sum;
			}
			System.out.println(n);
			n=s.nextInt();
		}
	}
}
