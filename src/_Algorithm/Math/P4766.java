package _Algorithm.Math;

import java.util.Scanner;

public class P4766 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i,j=-11;
		while((i=s.nextInt())!=999) {
			if(j>-11)System.out.println(i-j);
			j=i;
		}
	}

}
