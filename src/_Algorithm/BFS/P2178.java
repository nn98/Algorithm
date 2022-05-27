package _Algorithm.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2178 {

    static int n,m,i,j,h[][],p[]= {0,1,0,-1},q[]= {1,0,-1,0};
    static void o(int i,int j,int v) {
	System.out.println(i+" "+j+" "+v);
	h[i][j]=v++;
	int x=0,I,J;
	for(;x<4;x++) {
	    I=i+p[x];
	    J=j+q[x];
	    System.out.println(I+" "+J+" "+v);
	    if(I>=0&I<n&J>=0&J<m)if(a[I][J]=='1')if(h[I][J]==0|v<h[I][J])o(I,J,v);
	}
    }
    static char[][]a;
    public static void main(String[] args)throws Exception{
	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer t=new StringTokenizer(r.readLine());
	n=Integer.parseInt(t.nextToken());
	m=Integer.parseInt(t.nextToken());
	a=new char[n][];
	h=new int[n][m];
	for(;i<n;a[i++]=r.readLine().toCharArray());
	o(0,0,1);
	System.out.println(h[n-1][m-1]);
    }

}
