package _Algorithm.DFS;

import java.util.Scanner;

public class DFS_Main {

	static int n,m,i,j;
	static boolean[][]a;
	
	static void o(int x) {
		
	}
	
	public static void main(String[] args) {
		System.out.println((int)'');
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		m=s.nextInt();
		a=new boolean[n][n];
		for(;m-->0;i=s.nextInt(),j=s.nextInt(),a[i][j]=a[j][i]=true);
	}
}