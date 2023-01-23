package BaekJoon.Simple_Implementation;

import java.util.Scanner;

public class P15780 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=s.nextInt(),j=0;
		for(;i-->0;j+=(s.nextInt()+1)/2);
		System.out.println(n>j?"NO":"YES");
	}

}
