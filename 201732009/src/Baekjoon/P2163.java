package Baekjoon;

import java.util.Scanner;

public class P2163 {

	static int r=0;

	static void sol(int n,int m) {
		//		System.out.println(n+" "+m);
		if(n==1&&m==1) {
			//			System.out.println("re");
			return;
		}
		else if(n==1) {
			r++;
			if(m%2==0) {
				sol(n,m/2);
				sol(n,m/2);
			}
			else {
				sol(n,m/2);
				sol(n,m/2+1);
			}
		}
		else if(m==1) {
			r++;
			if(n%2==0) {
				sol(n/2,m);
				sol(n/2,m);
			}
			else {
				sol(n/2,m);
				sol(n/2+1,m);
			}
		}
		else {
			r++;
			if(n>m) {
				if(n%2==0) {
					sol(n/2,m);
					sol(n/2,m);
				}
				else {
					sol(n/2,m);
					sol(n/2+1,m);
				}
			}
			else {
				if(m%2==0) {
					sol(n,m/2);
					sol(n,m/2);
				}
				else {
					sol(n,m/2);
					sol(n,m/2+1);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		sol(n,m);
		System.out.println(r);
	}
}