package Baekjoon;

import java.util.Scanner;

public class Q1074 {
	static int count=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1/2="+1/2);
		int N=s.nextInt(),r=s.nextInt(),c=s.nextInt();
		int a=(int)Math.pow(2,N);
		//int[][] arr=new int[(int)Math.pow(2,N)][(int)Math.pow(2,N)];
		if(N>15) return;
		z(a,r,c);
	}

	public static void z(int a, int r, int c) {
		int result=0;
		if(a==1) {
			if(r==a&&c==a) System.out.println(count);
			else {
				System.out.println("r="+r+" c="+c);
				count++;
			}
		}
		else {
			z(a/2,r,c);
			z(a/2,r,c-a/2);
			z(a/2,r-a/2,c);
			z(a/2,r-a/2,c-a/2);
		}
	}

}
