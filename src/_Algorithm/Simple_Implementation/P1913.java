package _Algorithm.Simple_Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class P1913 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[][]=new int[n][n],i,j;
		for(i=0;i<=n/2;a[i][i]=(n-(i*2))*(n-(i*2)),i++);
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
