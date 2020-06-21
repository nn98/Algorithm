package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.Scanner;

public class Test00 {

	public static void main(String[] args)throws Exception{
		BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter W=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(R.readLine()),m,i=0,j,a[],r[];
		a=new int[n];
		r=new int[n];
		for(;i++<n;) {
			j=0;
			m=Integer.parseInt(R.readLine());
			while(a[j]>0)j++;
			while(m>0) {
				j++;
				while(a[j]>0)j++;
				m--;
			}
			while(a[j]>0)j++;
			a[j]++;
			r[j]=i;
		}
		for(i=0;i<n;W.write(r[i++]));
		W.flush();
	}

}
