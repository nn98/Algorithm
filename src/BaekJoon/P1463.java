package BaekJoon;

import java.util.Scanner;

public class P1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int K=s.nextInt(),i=0;
		for(;K!=1;i++) {
			if(K%3==0) K/=3;
			else if(K%2==0) K/=2;
			else K--;
			System.out.println(K);
		}
		System.out.println(i);
	}

}
