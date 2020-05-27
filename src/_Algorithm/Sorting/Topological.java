package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Topological {

	static int n,i,j,v[],t[];
	static boolean[][]a;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		v=new int[n];
		t=new int[n];
		a=new boolean[n][n];
		for(;i<n;i++) {
			v[i]=s.nextInt();
			while((j=s.nextInt())>=0)a[i][j]=true;
		}
		System.out.println(Arrays.toString(v));
		for(boolean[]b:a)
			System.out.println(Arrays.toString(b));
	}

}
