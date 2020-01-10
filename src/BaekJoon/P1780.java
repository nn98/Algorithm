package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//¿øÆ®
public class P1780{
	static int n,i,j,a[][],l[]=new int[3];
	static void o(int x,int y,int s) {
		boolean c=true;
		int v=a[x][y];
		for(int i=x;i<x+s&&c;i++)
			for(int j=y;j<y+s&&c;j++)
				c=a[i][j]==v;
		if(c)l[v+1]++;
		else{
			for(int i=x;i<x+s;i+=s/3)
				for(int j=y;j<y+s;j+=s/3)
					o(i,j,s/3);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n][n];
		for(int i=0;i<n;i++) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			for(int j=0;j<n;j++)
				a[i][j]=Integer.parseInt(t.nextToken());
		}
		o(0,0,n);
		for(int i:l)System.out.println(i);
	}
}