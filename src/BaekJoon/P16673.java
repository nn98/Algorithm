package BaekJoon;

import java.util.Scanner;

public class P16673 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c=s.nextInt(),k=s.nextInt(),p=s.nextInt();
		long sum=0;
		for(int i=1;i<=c;i++) {
			sum+=k*i+p*(i*i);
		}
		System.out.println(sum);
	}
}
