package _Algorithm.DFS;

import java.io.*;
import java.util.*;

public class P16173 {

    static int n,m,i,j,k,a[][],h[][],R;
    static void o(int x,int y) {
	if(a[x][y]==-1|R>0) {
	    R++;
	    return;
	}
	h[x][y]++;
	int X=x+a[x][y],Y=y+a[x][y];
	if(X<n)if(h[X][y]<1)o(X,y);
	if(Y<n)if(h[x][Y]<1)o(x,Y);
    }
    public static void main(String[] args)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	n=Integer.parseInt(r.readLine());
	h=new int[n][n];
	a=new int[n][n];
	StringTokenizer t;
	for(;i<n;i++) {
	    t=new StringTokenizer(r.readLine());
	    for(j=0;j<n;a[i][j++]=Integer.parseInt(t.nextToken()));
	}
	o(0,0);
	System.out.println(R==0?"Hing":"HaruHaru");
    }

}
