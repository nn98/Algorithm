package BaekJoon;

import java.util.Scanner;

public class P17174 {
	
	static int N,M,sum=0;
	
	static void sol(int mon) {
		if(mon==0) return;
		sum+=mon;
		sol(mon/M);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		M=s.nextInt();
		sol(N);
		System.out.println(sum);
	}

}
