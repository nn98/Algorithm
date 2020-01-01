package BaekJoon;

import java.util.Scanner;
public class P10768 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt(),d=s.nextInt();
		System.out.print(m==2?(d==18?"Special":(d<18?"Before":"After")):(m<2?"Before":"After"));
	}
}