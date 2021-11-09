package _Algorithm.DFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P2667 {
	static int n,i,j,c,X[]= {1,0,-1,0},Y[]= {0,1,0,-1};
	static char a[][];
	static boolean[][]v;
	static List<Integer>l=new ArrayList();
	static void o(int x,int y) {
		c++;
		v[x][y]=true;
		for(int k=0;k<4;k++)
			if(!v[x+X[k]][y+Y[k]])
				o(x+X[k],y+Y[k]);
	}

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		a=new char[n][n];
		v=new boolean[n][n];
		for(;i<n;i++,j=0) {
			for(char c:r.readLine().toCharArray())
				a[i][j++]=c;
		}
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				if(!v[i][j]) {
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
