package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1953 {

	static int n,m,i,p,q,R,a[][],b[];
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		for(;i<n;i++) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			m=Integer.parseInt(t.nextToken());
			for(;m-->0;) {
				p=Integer.parseInt(t.nextToken());
				q=Integer.parseInt(t.nextToken());
				a[p][q]=a[q][p]=1;
			}
		}
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
