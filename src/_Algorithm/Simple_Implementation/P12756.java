package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P12756 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),x=b/s.nextInt(),y=s.nextInt()/a;
		System.out.print(x==y?"DRAW":("PLAYER "+(x>y?"A":"B")));
	}

}
