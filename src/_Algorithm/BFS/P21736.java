package _Algorithm.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P21736 {
	static int n,m,i,j,h[][],p[]= {0,1,0,-1},q[]= {1,0,-1,0};
	static char[][]a;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]b=r.readLine().split(" ");
		n=Integer.parseInt(b[0]);
		m=Integer.parseInt(b[0]);
		a=new char[n][];
		for(;i<n;a[i++]=r.readLine().toCharArray());
	}

}
