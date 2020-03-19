package BaekJoon;

import java.util.Scanner;

public class P2525 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt()+s.nextInt();
		System.out.print((n+m/60)%24+" "+m%60);
	}

}
