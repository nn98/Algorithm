package BaekJoon;

import java.util.Scanner;

public class P11945_S {
	//hasNext 먹히네 프로그램종료 안따지는듯
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.next();
		while(s.hasNext()) {
			System.out.println(new StringBuffer(s.next()).reverse());
		}
	}

}
