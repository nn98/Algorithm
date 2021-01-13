package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P14652 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),z=s.nextInt()+1;
		System.out.print(z/y+" "+(z%y-1));
	}

}
