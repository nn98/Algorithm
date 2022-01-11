package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P17265_2 {
	static int n,i,j,a,A[][],B[][];
	static String[][]d;
	static void o(int x,int y,String z) {
		switch(z) {
		case "+":
			a=x+y;
			break;
		case "-":
			a=x-y;
			break;
		case "*":
			a=x*y;
		}
	}
	static void p(int x,int y) {
		if(x%2>0&y%2>0) {
			if(x>0) {
				
			}
		}
	}
	static void q(int x,int y) {
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		A=new int[n][n];
		for(int[]C:A)
			Arrays.fill(C,Integer.MIN_VALUE);
		B=new int[n][n];
		for(int[]C:B)
			Arrays.fill(C,Integer.MAX_VALUE);
		d=new String[n][n];
		for(;i<n;i++,j=0)
			for(String s:r.readLine().split(" "))d[i][j++]=s;
		p(0,0);
		q(0,0);
		System.out.println(A[n-1][n-1]+" "+B[n-1][n-1]);
	}
}