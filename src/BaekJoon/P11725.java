package BaekJoon;

import java.util.Scanner;

public class P11725 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		s.nextLine();
		for(int i=0;i<N;i++) {
			String[] t=s.nextLine().split(" ");
			System.out.println(t[1]);
		}
	}

}
