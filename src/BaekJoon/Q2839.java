package Baekjoon;

import java.util.Scanner;

public class Q2839 {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=s.nextInt();
		int five=0;
		int three=0;
		while(N%5!=0&&N>=0) {
			N-=3;
			three++;
		}
		if(N<0) {
			System.out.println(-1);
		}
		else {
			five=N/5;
			System.out.println(five+three);
		}
	}

}
