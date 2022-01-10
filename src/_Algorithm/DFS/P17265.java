package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P17265 {
	static int n,i,j,a,b,A[][],B[][];
	static String[][]d;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		A=new int[n][n];
		B=new int[n][n];
		d=new String[n][n];
		for(;i<n;i++,j=0)
			for(String s:r.readLine().split(" "))d[i][j++]=s;

	}
}