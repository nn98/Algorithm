package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P1388 {

    static int n,m,i,j,h[][],R;
    static char[][]a;
    public static void main(String[] args)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	n=r.readLine().charAt(0)-'0';
	System.out.println(n);
	a=new char[n][];
	for(;i<n;a[i++]=r.readLine().toCharArray());
    }

}
