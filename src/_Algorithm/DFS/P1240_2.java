package _Algorithm.DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1240_2 {
	static int n,m,i,j,l,v[],a[][];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		l=n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		v=new int[n];
		a=new int[n][n];
		while(--l>0) {
			t=new StringTokenizer(r.readLine());
			i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			a[i][j]=a[j][i]=Integer.parseInt(t.nextToken());
		}
	}

}