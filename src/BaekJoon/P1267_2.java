package BaekJoon;

import java.util.Scanner;

public class P1267_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a=1,Y=0,M=0;
		for(int i=0;i<n;i++)a+=s.nextInt();
		Y+=(a/30+(a%30==0?0:1))*10;
		M+=(a/60+(a%60==0?0:1))*15;
		System.out.println(Y+" "+M);
		if(Y==M)
			System.out.print("Y M "+Y);
		else if(Y<M)
			System.out.print("Y "+Y);
		else
			System.out.print("M "+M);
	}

}
