package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2959 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,a[]=new int[4];
		for(;i<4;a[i++]=s.nextInt());
		Arrays.sort(a);
		System.out.print(a[0]*a[2]);
	}

}
