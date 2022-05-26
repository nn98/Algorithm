package _Algorithm.BFS;

import java.io.*;
import java.util.*;

public class P14502{
    static int n,m,i,j,h[][],p[]= {0,1,0,-1},q[]= {1,0,-1,0};
    static String[][]a;
    static void o(int x,int y) {
	h[x][y]++;
	
    }
    public static void main(String[]z)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer t=new StringTokenizer(r.readLine());
	n=Integer.parseInt(t.nextToken());
	m=Integer.parseInt(t.nextToken());
	h=new int[n][m];
	a=new String[n+2][m+2];
	for(;i++<n;) {
	    t=new StringTokenizer(r.readLine());
	    for(j=0;j++<m;a[i][j]=t.nextToken());
	}
	for(String[]s:a)System.out.println(Arrays.toString(s));
    }
}
