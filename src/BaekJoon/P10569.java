package BaekJoon;

import java.util.Scanner;

public class P10569 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a,b;
		for(;n-->0;a=s.nextInt(),b=s.nextInt(),System.out.println((a-b-2)*-1));
	}

}
