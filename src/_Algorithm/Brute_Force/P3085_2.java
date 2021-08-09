package _Algorithm.Brute_Force;

import java.io.*;

public class P3085_2 {

	static int n,d[][],i,R,j;
	static char a[][],t;
	static void o(int i,int j,int n,int c) {
		R=R>c?R:c++;
		if(n>0) {
			if(j<n+1)
				if(a[i][j+1]==a[i][j])
					o(i,j+1,n,c);
		}else{
			if(i<n+1)
				if(a[i+1][j]==a[i][j])
					o(i+1,j,n,c);
		}
		
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		i=n=Integer.parseInt(r.readLine());
		d=new int[n][n];
		a=new char[n][n];
		while(i-->0)a[i]=r.readLine().toCharArray();
		System.out.println();
		for(i=0;i<n-1;i++)
			for(j=0;j<n-1;j++) {
				t=a[i][j];
				a[i][j]=a[i][j+1];
				a[i][j+1]=t;
				for(char[]b:a)
					System.out.println(b);
				System.out.println();
				o(i,j,0,1);
				a[i][j+1]=a[i][j];
				a[i][j]=t;
				
				a[i][j]=a[i+1][j];
				a[i+1][j]=t;
				for(char[]b:a)
					System.out.println(b);
				System.out.println();
				o(i,j,1,1);
				a[i+1][j]=a[i][j];
				a[i][j]=t;
			}
		System.out.println(R);
	}

}
