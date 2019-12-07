package BaekJoon;

import java.util.Scanner;

public class P4470 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		s.nextLine();
		while(++i<=n)
			System.out.println(i+". "+s.nextLine());
	}
}