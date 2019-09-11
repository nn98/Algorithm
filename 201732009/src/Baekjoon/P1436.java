package Baekjoon;

import java.util.Scanner;

public class P1436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==1) System.out.println("666");
		else {
			int i=1;
			for(;n>2;) {
				i++;
				if((i%10)==6) i++;
				n--;
			}
			System.out.println(i+"666");
		}
	}

}
