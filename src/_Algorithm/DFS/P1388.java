package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1388 {

    static int n[]=new int[2],i,j,h[][],R;
    static char[][]a;
    static void o(int i,int j,char c) {
	h[i][j]++;
	char d=a[i][j];
//	R+=c==d?0:1;
	System.out.println(i+" "+j+" c:"+c+" d:"+d);
	if(i<n[0]-1)if(h[i+1][j]<1)o(i+1,j,d=='|'?d:0);
	if(j<n[1]-1)if(h[i][j+1]<1)o(i,j+1,d=='-'?d:0);
    }
    public static void main(String[] args)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	for(String s:r.readLine().split(" "))n[j++]=Integer.parseInt(s);
	h=new int[n[0]][n[1]];
	a=new char[n[0]][];
	for(;i<n[0];a[i++]=r.readLine().toCharArray());
	o(0,0,'0');
	System.out.println(R);
    }

}
