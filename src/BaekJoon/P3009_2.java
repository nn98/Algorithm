package BaekJoon;

import java.util.Scanner;

public class P3009_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,x=0,y=0;
		for(;i++<3;x^=s.nextInt(),y^=s.nextInt());
		System.out.print(x+" "+y);
	}
}