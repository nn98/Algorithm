package _Algorithm.Brute_Force;

import java.io.*;
import java.util.Arrays;

public class P3085 {

	static int n,i,j,r,d[][];
	static char[][]a;
	static boolean[][]h;
	static void o(int x,int y,int v,int r) {
		System.out.print(x+" "+y+" ");
		if(++v>d[x][y])d[x][y]=v;
		System.out.println(d[x][y]+" r: "+r);
		if(r>0&x<n-1) {
			if(a[x+1][y]==a[x][y])
				if(d[x+1][y]<v)
					o(x+1,y,v,r);
		}
		if(r==0&y<n-1)
			if(a[x][y+1]==a[x][y])
				if(d[x][y+1]<v)
					o(x,y+1,v,r);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		i=n=Integer.parseInt(r.readLine());
		d=new int[n][n];
		a=new char[n][];
		h=new boolean[n][n];
		while(i-->0)a[i]=r.readLine().toCharArray();
		for(char[]b:a)
			System.out.println(b);
		for(;++i<n-1;)
			for(j=0;j<n-1;j++) {
				char t=a[i][j];
				a[i][j]=a[i+1][j];
				a[i+1][j]=t;
				o(i,j,0,1);
				t=a[i][j];
				a[i][j]=a[i+1][j];
				a[i+1][j]=t;
				
				t=a[i][j];
				a[i][j]=a[i][j+1];
				a[i][j+1]=t;
				o(i,j,0,0);
				t=a[i][j+1];
				a[i][j]=a[i][j+1];
				a[i][j+1]=t;
			}
		for(int[]b:d)
			System.out.println(Arrays.toString(b));
	}

}
