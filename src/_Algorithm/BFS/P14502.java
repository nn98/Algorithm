package _Algorithm.BFS;

import java.io.*;
import java.util.*;

public class P14502{
    static int n,m,i,j,h[][];
    static String[][]a;
    public static void main(String[]z)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer t=new StringTokenizer(r.readLine());
	n=Integer.parseInt(t.nextToken());
	m=Integer.parseInt(t.nextToken());
	for(;i<n;i++) {
	    t=new StringTokenizer(r.readLine());
	    for(j=0;j<m;a[i][j++]=t.nextToken());
	}
	for(String[]s:a)System.out.println(Arrays.toString(s));
    }
}
