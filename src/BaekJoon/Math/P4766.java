package BaekJoon.Math;

import java.util.Scanner;

public class P4766 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double i,j=-11;
		while((i=s.nextDouble())!=999) {
			if(j>-11)System.out.println(String.format("%.2f",i-j));
			j=i;
		}
	}

}
