package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P25372 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt(),j;
		for(;i-->0;System.out.println((j=s.next().length())>5&j<10?"yes":"no"));
	}

}
