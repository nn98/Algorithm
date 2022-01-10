package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P17265 {
	static int n,i,j,a,A[][],B[][];
	static String[][]d;
	static void o(int x,int y,String z) {
		switch(z) {
		case "+":
			a=x+y;
			break;
		case "-":
			a=x-y;
			break;
		case "*":
			a=x*y;
		}
	}
	static void p(int x,int y,int z) {
		A[x][y]=z;
		if(x<n-2) {
			o(z,Integer.parseInt(d[x+2][y]),d[x+1][y]);
			if(A[x+2][y]<a)
				p(x+2,y,a);
		}
		if(y<n-2) {
			o(z,Integer.parseInt(d[x][y+2]),d[x][y+1]);
			if(A[x][y+2]<a)
				p(x,y+2,a);
		}
	}
	static void q(int x,int y,int z) {
		B[x][y]=z;
		if(x<n-2) {
			o(z,Integer.parseInt(d[x+2][y]),d[x+1][y]);
			if(B[x+2][y]>a)
				q(x+2,y,a);
		}
		if(y<n-2) {
			o(z,Integer.parseInt(d[x][y+2]),d[x][y+1]);
			if(B[x][y+2]>a)
				q(x,y+2,a);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		A=new int[n][n];
		Arrays.fill(A,Integer.MIN_VALUE);
		B=new int[n][n];
		d=new String[n][n];
		for(;i<n;i++,j=0)
			for(String s:r.readLine().split(" "))d[i][j++]=s;
		p(0,0,0);
		q(0,0,0);
		System.out.println(A[n-1][n-1]+" "+B[n-1][n-1]);
	}
}