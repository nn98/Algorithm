package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P14173 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),u;
		x=Math.abs(x-s.nextInt());
		y=Math.abs(y-s.nextInt());
		u=x*y;
		x=s.nextInt();
		y=s.nextInt();
		x=Math.abs(x-s.nextInt());
		y=Math.abs(y-s.nextInt());
		u+=x*y;
		System.out.println(u);
	}

}
