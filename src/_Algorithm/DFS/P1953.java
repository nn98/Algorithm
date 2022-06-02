package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1953 {

	static int n,m,i,j,R,a[][],b[],h[];
	static void o(int x) {
		h[x]++;
		for(int i=0;++i<n;) {
			b[i]=a[x][i];
		}
		for(int i=0;++i<n;) {
			if(a[x][i]<1)if(h[i]<1){
				p(i);
			}
		}
	}
	static void p(int y) {
		for(int i=0;++i<n;) {
			b[i]=a[y][i];
		}
		for(int i=0;++i<n;) {
			if(a[y][i]<1)if(h[i]<1){
				p(i);
			}
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine())+1;
		h=new int[n];
		b=new int[n];
		a=new int[n][n];
		for(;++i<n;) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			m=Integer.parseInt(t.nextToken());
			for(;m-->0;) {
				j=Integer.parseInt(t.nextToken());
				a[i][j]=a[j][i]=1;
			}
		}
		for(int[]b:a)System.out.println(Arrays.toString(b));
		o(1);
		System.out.println(Arrays.toString(b));
	}

}
