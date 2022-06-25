package _Algorithm.BFS;

import java.io.*;
import java.util.*;
public class P7576_2 {

	static int n,m,a[][],i,j,k,R,s[]=new int[3];
	static void o(int x,int y) {
		
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		m=Integer.parseInt(t.nextToken());
		n=Integer.parseInt(t.nextToken());
		a=new int[n][m];
		for(;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<m;a[i][j]=Integer.parseInt(t.nextToken()),s[a[i][j++]+1]++);
		}
		System.out.println(Arrays.toString(s));
	}

}
