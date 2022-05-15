package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P16173 {

    static int n,m,i,j,k,a[][],h[];
    public static void main(String[] args)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(r.readLine());
	h=new int[n];
	a=new int[n][n];
	StringTokenizer t;
	for(;i<n;i++) {
	    t=new StringTokenizer(r.readLine());
	    for(j=0;j<n;a[i][j++]=Integer.parseInt(t.nextToken()));
	}
	
    }

}
