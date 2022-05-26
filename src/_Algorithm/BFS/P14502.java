package _Algorithm.BFS;

import java.io.*;
import java.util.*;

public class P14502{
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
	R=0;
	h=new int[n+2][m+2];
	a=new String[n+2][m+2];
	for(;i++<n;) {
	    t=new StringTokenizer(r.readLine());
	    for(j=0;j++<m;S=(a[i][j]=t.nextToken()).equals("0")?1:0);
	}
	//	for(String[]s:a)System.out.println(Arrays.toString(s));
	System.out.println(R+" "+S);
	for(int a1=0;a1++<n;)
	    for(int a2=0;a2++<m;) {
		if(a[a1][a2].equals("0")) {
		    a[a1][a2]="1";
		    for(int b1=a1;b1++<n;)
			for(int b2=a2;b2++<m;) {
			    if(a[b1][b2].equals("0")) {
				a[b1][b2]="1";
				for(int c1=b1;c1++<n;)
				    for(int c2=b2;c2++<m;)
					if(a[c1][c2].equals("0")) {
					    a[c1][c2]="1";
					    for(String[]s:a)System.out.println(Arrays.toString(s));
					    System.out.println();
//					    for(i=0;i++<n;) {
//						for(j=0;j++<m;j++) {
//						    P=0;
//						    C=0;
//						    if(h[i][j]<1)
//							if(!a[i][j].equals("1"))
//							    o(i,j);
//						    s+=P<1?0:C;
//						}
//						System.out.println(String.format("R:%d S:%d s:%d",R,S,s));
//						R=R>S-s?R:S-s;
//						    s=0;
//					    }
					}
			    }
			}
		}
	    }
    }
}
