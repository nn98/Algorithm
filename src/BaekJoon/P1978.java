package BaekJoon;

import java.util.Scanner;

public class P1978 {

	static int sol(int n) {
		if(n==1) return 0;
		for(int i=2;i<n;i++) {
			if(n%i==0) return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),sum=0;
		for(int i=0;i<n;i++) sum+=sol(s.nextInt());
		System.out.println(sum);
	}

}
