package BaekJoon.Brute_Force;

import java.io.*;

public class P3085_2 {

	static int n,d[][],i,R,j;
	static char a[][],t;
	static void o(int i,int j,int v,int c) {
//		System.out.println(i+" "+j+" "+v+" "+c);
		R=R>c?R:c;
		c++;
		if(v>0) {
			if(i<n-1)
				o(i+1,j,v,a[i+1][j]==a[i][j]?c:1);
		}
		else
			if(j<n-1)
				o(i,j+1,v,a[i][j+1]==a[i][j]?c:1);


	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		d=new int[n][n];
		a=new char[n][n];
		while(i<n)a[i++]=r.readLine().toCharArray();
		for(i=0;i<n;i++)
			for(j=0;j<n;j++) {
				t=a[i][j];
				if(j<n-1)
				{
					a[i][j]=a[i][j+1];
					a[i][j+1]=t;
//					for(char[]b:a)
//						System.out.println(b);
//					System.out.println();
					o(i,0,0,1);
					o(0,j,1,1);
					if(j==n-2)o(0,j+1,0,1);
					a[i][j+1]=a[i][j];
					a[i][j]=t;
				}

				if(i<n-1)
				{
					a[i][j]=a[i+1][j];
					a[i+1][j]=t;
//					for(char[]b:a)
//						System.out.println(b);
//					System.out.println();
					o(i,0,0,1);
					o(0,j,1,1);
					if(i==n-2)o(i+1,0,1,1);
					a[i+1][j]=a[i][j];
					a[i][j]=t;
				}
			}
		System.out.println(R);
	}

}
