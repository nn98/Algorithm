package BaekJoon;

import java.util.Scanner;

public class P1834 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long sum=0,N=s.nextLong();
		for(long i=1;i<N;i++) sum+=(N+1)*i;
		System.out.println(sum);
	}
}