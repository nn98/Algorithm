package _Algorithm.DFS;

import java.util.*;
import java.io.*;
public class DFS_Test {

	static int n,m,i,j;
	static boolean[]a[],b;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.print("Directed? (y/n): ");
		boolean c=r.readLine().equals("n");
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken())+1;
		m=Integer.parseInt(t.nextToken());
		a=new boolean[n][n];
		b=new boolean[n];
		for(;m-->0;) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			if(c)a[i][j]=true;
			a[j][i]=true;
		}
		for(boolean[]d:a)System.out.println(Arrays.toString(d));
	}

}
