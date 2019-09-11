package Baekjoon;

import java.util.Scanner;

public class P1436_C {
	//6의 개수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),count=0;
		for(int i=666;!(n==count);i++) {
			if(String.valueOf(i).contains("666")) count++;
			if(n==count) System.out.println(i);
		}
	}
}
