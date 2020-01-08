package BaekJoon;

import java.io.*;
import java.util.*;
public class P5573{
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		int x=Integer.parseInt(t.nextToken()),y=Integer.parseInt(t.nextToken()),n=Integer.parseInt(t.nextToken()),a[][]=new int[x][y],i=0,j;
		for(;i<x;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<y;a[i][j++]=Integer.parseInt(t.nextToken()));
//			System.out.println(Arrays.toString(a[i]));
		}
		for(;n-->0;) {
			i=j=0;
			for(;i<x&&j<y;) {
				if(a[i][j]==0)a[i++][j]=1;
				else a[i][j++]=0;
			}
			if(n==0)
				System.out.println(++i+" "+(j+1));
		}
	}
}