package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1953 {

	static int n,m,i,j,R,a[][],b[],h[];
	static void o(int x) {
		//		System.out.println(x+Arrays.toString(b));
		h[x]++;
		for(int i=0;++i<n;) {
			b[i]=a[x][i];
		}
		for(int i=0;++i<n;) {
			if(a[x][i]<1)if(b[i]<1)if(h[i]<1){
				p(i);
			}
		}
	}
	static void p(int y) {
		//		System.out.println(y+Arrays.toString(b));
		h[y]++;
		for(int i=0;++i<n;) {
			if(a[y][i]>0)b[i]=1;
		}
		for(int i=0;++i<n;) {
			if(a[y][i]<1)if(b[i]<1)if(h[i]<1){
				p(i);
			}
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer f=new StringBuffer();
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
		//		for(int[]b:a)System.out.println(Arrays.toString(b));
		o(1);
		//		System.out.println(Arrays.toString(b));
		m=0;
		for(int x:b)m+=x<1?1:0;
		if(m==0|m==n) {
			for(i=0;++i<n-1;R+=b[i]<1?1:0)if(b[i]<1)f.append(i+" ");
			System.out.println(R+"\n"+f);
			System.out.println(1+"\n"+(n-1));
		}else {
			for(i=0;++i<n;R+=b[i]<1?1:0)if(b[i]<1)f.append(i+" ");
			System.out.println(R+"\n"+f);
			R=0;
			f=new StringBuffer();
			for(i=0;++i<n;R+=b[i]>0?1:0)if(b[i]>0)f.append(i+" ");
			System.out.println(R+"\n"+f);
		}
	}

}
