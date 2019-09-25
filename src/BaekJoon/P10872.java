package BaekJoon;

import java.util.Scanner;

public class P10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int r=1;
		for(int i=1;i<=N;i++) r*=i;
		System.out.println(r);
	}

}
