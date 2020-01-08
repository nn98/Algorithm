package BaekJoon;

import java.util.Scanner;

public class P2979 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[3],i=0,f,t;
		for(;i<3;a[i++]=s.nextInt());
		boolean[][]A=new boolean[3][101];
		for(i=0;i<3;i++) {
			f=s.nextInt();
			t=s.nextInt();
			for(;f<=t;A[i][f++]=true);
		}
		f=0;
		for(i=0;i<101;i++) {
			t=0;
			t+=A[0][i]?1:0;
			t+=A[1][i]?1:0;
			t+=A[2][i]?1:0;
		}
	}

}
