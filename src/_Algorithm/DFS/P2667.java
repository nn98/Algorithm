package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P2667 {
	static int n,i,j,c,X[]= {1,0,-1,0},Y[]= {0,1,0,-1},a[][];
	static boolean[][]v;
	static List<Integer>l=new ArrayList();
	static void o(int x,int y) {
		c++;
		v[x][y]=true;
		for(int k=0;k<4;k++)
			if(!v[x+X[k]][y+Y[k]]&a[x+X[k]][y+Y[k]]>0)
				o(x+X[k],y+Y[k]);
	}

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		a=new int[n+2][n+2];
		v=new boolean[n+2][n+2];
		for(;i++<n;j=0) {
			for(char c:r.readLine().toCharArray())
				a[i][++j]=c-'0';
		}
		for(i=0;i++<n;)
			for(j=0;j++<n;)
				if(!v[i][j]&a[i][j]>0) {
					o(i,j);
					l.add(c);
					c=0;
				}
		Collections.sort(l);
		w.write(l.size()+"\n");
		for(int c:l)w.write(c+"\n");
		w.flush();
	}

}
