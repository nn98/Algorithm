package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P19944 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		System.out.println(m==1|m==2?"NEWBIE!":(m<=n?"OLDBIE!":"TLE!"));
	}

}
