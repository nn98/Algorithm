package _Algorithm.Brute_Force;

import java.io.*;

public class P3085_3 {

	static int n,i,j,R,k,x,y;
	static char t,a[][];
	
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new char[n][n];
		while(j<n)a[j++]=r.readLine().toCharArray();
		for(;i<n;i++)
			for(j=0;j<n;j++) {
				t=a[i][j];
				a[i][j]=a[i][j+1];
				a[i][j+1]=t;
				for(x=0;x<n;x++) {
					k=1;
					for(y=1;y<n;y++) {
						if(a[x][y]==a[x][y-1])k++;
						else {
							R=R>k?R:k;
					k=1;
						}
					}
				}
					
			}
	}

}
