package BaekJoon;

import java.util.Scanner;

public class P1269_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),o=100000001;
		boolean[]a=new boolean[o],b=new boolean[o];
		for(;n-->0;a[s.nextInt()]=true);
		for(;m-->0;b[s.nextInt()]=true);
//		System.out.println(n);
		for(;o-->0;n+=a[o]^b[o]?1:0);
		System.out.println(n+1);
	}
}