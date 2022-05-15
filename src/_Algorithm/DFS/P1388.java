package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1388 {

    static int n,m,i,j,h[][],R;
    static char[][]a;
    static void o(int i,int j,char c) {
	h[i][j]++;
	R+=c==a[i][j]?0:1;
	if(h[i+1][j]<1)o(i+1,j,a[i][j]);
	if(h[i][j+1]<1)o(i,j+1,a[i][j]);
    }
    public static void main(String[] args)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	n=r.readLine().charAt(0)-'0';
	System.out.println(n);
	h=new int[n][n];
	a=new char[n][];
	for(;i<n;a[i++]=r.readLine().toCharArray());
	o(0,0,'0');
	System.out.println(R);
    }

}
