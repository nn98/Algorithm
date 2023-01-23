package BaekJoon.BFS;
import java.io.*;
import java.util.*;

public class P7576{
    static int n,m,i,j,h[][],p[]= {0,1,0,-1},q[]= {1,0,-1,0},
	    P,C,R,S,s,g,z,v,b;
    static String[][]a;
    static void o(int x,int y) {
	C++;
	h[x][y]++;
	P=a[x][y].equals("2")?1:P;
	int i=0,X,Y;
	for(;i<4;i++) {
	    X=x+p[i];
	    Y=y+q[i];
	    if(a[X][Y]!=null)
		if(h[X][Y]<1)
		    if(!a[X][Y].equals("1"))
			o(X,Y);
	}
    }
    public static void main(String[]L)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer t=new StringTokenizer(r.readLine());
	n=Integer.parseInt(t.nextToken());
	m=Integer.parseInt(t.nextToken());
	R=n*m;
	h=new int[n+2][m+2];
	a=new String[n+2][m+2];
	for(;i++<n;) {
	    t=new StringTokenizer(r.readLine());
	    for(j=0;j++<m;a[i][j]=t.nextToken());
	}
    }
}
