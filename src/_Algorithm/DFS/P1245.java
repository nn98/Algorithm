package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P1245 {
	static int n,m,i,j,a[][],b[][],R,p[]= {1,0,-1,0},q[]= {0,1,0,-1},h[][];
	static void o(int x,int y) {
		h[x][y]++;
		int i=0,X,Y,Z=a[x][y],W=b[x][y];
		a[x][y]=-1;
		b[x][y]=-1;
		for(;i<4;) {
			X=x+p[i];
			Y=y+q[i++];
			if(X>=0&X<n&Y>=0&Y<m)
				if(h[X][Y]<1)
					if(a[X][Y]==Z)
						if(b[X][Y]==W)o(X,Y);
						else R=2;
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new int[n][m];
		b=new int[n][m];
		h=new int[n][m];
		for(;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<m;a[i][j++]=Integer.parseInt(t.nextToken()));
		}
		for(i=0;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<m;b[i][j++]=Integer.parseInt(t.nextToken()));
		}
		for(i=0;i<n&R<2;i++) {
			for(j=0;j<m&R<2;j++) {
				if(h[i][j]<1) {
					if(a[i][j]!=b[i][j]) {
//						System.out.println("E: "+i+" "+j);
						R++;
					}
					if(R<2) {
						o(i,j);
//						for(int[]c:h)System.out.println(Arrays.toString(c));
					}
				}
			}
		}
//		System.out.println(R);
		System.out.println(R<2?"YES":"NO");
	}

}
/*
3 5
1 1 1 2 2
1 1 1 2 2
1 1 1 1 1
1 1 1 2 2
1 1 1 2 2
1 1 1 2 2

3 5
1 1 1 2 2
1 1 1 2 2
1 1 1 2 2
1 1 1 2 2
1 1 1 2 2
1 1 1 1 1
*/