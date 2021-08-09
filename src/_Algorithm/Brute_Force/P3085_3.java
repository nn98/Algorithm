package _Algorithm.Brute_Force;

import java.io.*;

public class P3085_3 {

	static int n,i,j,R,k,x,y;
	static char t,a[][];

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new char[n+1][n+1];
		for(;i<n;i++,j=0)
			for(char b:r.readLine().toCharArray())
				a[i][j++]=b;
		for(i=0;i<n;i++)
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
						R=R>k?R:k;
					}
				}
//				for(y=0;y<n;y++) {
//					k=1;
//					for(x=1;x<n;x++) {
//						if(a[x][y]==a[x-1][y])k++;
//						else {
//							R=R>k?R:k;
//							k=1;
//						}
//						R=R>k?R:k;
//					}
//				}
				for(y=0;y<n;y++) {
					k=1;
					for(x=0;x<n-1;x++)
						if(a[x+1][i]==a[x][y])k++;
						else {
							R=R>t?R:t;
							k=1;
						}
					R=R>t?R:t;
				}
			}
		System.out.println(R);
	}

}
