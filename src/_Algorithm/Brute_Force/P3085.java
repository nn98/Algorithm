package _Algorithm.Brute_Force;

import java.io.*;

public class P3085 {

	static int n,i,j,r,d[][];
	static char[][]a;
	static boolean[][]h;
	static void o(int x,int y,int v,int r) {
		d[x][y]=v;
		if(r<0) {
			if(a[x+1][y]==a[x][y])
				if(d[x+1][y]<v+1)
					o(x+1,y,v+1,0);
		}
		else
			if(a[x][y+1]==a[x][y])
				if(d[x][y+1]<v+1)
					o(x,y+1,v+1,1);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		i=n=Integer.parseInt(r.readLine());
		a=new char[n][];
		h=new boolean[n][n];
		while(i-->0)a[i]=r.readLine().toCharArray();
		System.out.println(i);
	}

}
