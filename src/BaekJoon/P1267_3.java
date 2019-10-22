package BaekJoon;

import java.util.Scanner;

public class P1267_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],Y=0,M=0;
		for(int i=0;i<n;i++)a[i]=s.nextInt();
		for(int i=0;i<n;i++) {
			Y+=(a[i]/30+1)*10;
			M+=(a[i]/60+1)*15;
//			System.out.println(Y+" "+M);
		}
		if(Y==M)
			System.out.print("Y M "+Y);
		else if(Y<M)
			System.out.print("Y "+Y);
		else
			System.out.print("M "+M);
	}
}