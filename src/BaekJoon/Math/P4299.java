package BaekJoon.Math;

import java.util.Scanner;

public class P4299 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0;
		for(;m+i<n;m++,i++);
		System.out.println(n==m+i?m+" "+i:-1);
	}

}
