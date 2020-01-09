package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1780 {

	static int n,i,j,a[][],r[]=new int[3];
	static void o(int x,int y,int s) {
		boolean c=true;
		int v=a[x][y];
		for(int i=x;i<x+s&&c;i++)
			for(int j=y;j<y+s&&c;j++)
				c=a[i][j]==v;
		if(c)r[v+1]++;
		else{
			
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n][n];
		
	}
}