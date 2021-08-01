package _Algorithm.Brute_Force;

import java.io.*;
import java.util.Arrays;

public class P3085 {

	static int n,i,j,r,d[][];
	static char[][]a;
	static boolean[][]h;
	static void o(int x,int y,int v,int r) {
		System.out.println(x+" "+y);
		d[x][y]=++v;
		if(r>0&x<n-1) {
			if(a[x+1][y]==a[x][y])
				if(d[x+1][y]<v)
					o(x+1,y,v,1);
		}
		if(r==1|y==n-1)return;
		if(a[x][y+1]==a[x][y])
			if(d[x][y+1]<v)
				o(x,y+1,v,0);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		i=n=Integer.parseInt(r.readLine());
		d=new int[n][n];
		a=new char[n][];
		h=new boolean[n][n];
		while(i-->0)a[i]=r.readLine().toCharArray();
		for(;++i<n;)
			for(;j<n;o(i,j++,0,2));
		for(int[]b:d)
			System.out.println(Arrays.toString(b));
	}

}
