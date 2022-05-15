package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1388 {

    static int n,m,i,j,h[][],R;
    static char[][]a;
    static void o(int i,int j,char c) {
	h[i][j]++;
	char d=a[i][j];
	R+=c==d?0:1;
	if(i<n-1)if(h[i+1][j]<1)o(i+1,j,d=='|'?d:0);
	if(j<n-1)if(h[i][j+1]<1)o(i,j+1,d=='-'?d:0);
    }
    public static void main(String[] args)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	n=r.readLine().charAt(0)-'0';
	h=new int[n][n];
	a=new char[n][];
	for(;i<n;a[i++]=r.readLine().toCharArray());
	o(0,0,'0');
	System.out.println(R);
    }

}
