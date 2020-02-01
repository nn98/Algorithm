package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11004 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],m=s.nextInt();
		for(;n-->0;a[n]=s.nextInt());
		Arrays.sort(a);
		System.out.print(a[m-1]);
	}

}
