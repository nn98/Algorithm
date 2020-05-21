package _Algorithm.DFS;

import java.util.Scanner;

public class P11266 {

	static int n,m,r,c[],i,j;
	static boolean[]a,b[];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,m=s.nextInt();
		a=new boolean[n];
		b=new boolean[n][n];
		c=new int[n];
		for(;m-->0;i=s.nextInt(),j=s.nextInt(),b[i][j]=b[j][i]=true);
	}

}
