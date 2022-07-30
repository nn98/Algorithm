package _Algorithm.DFS;
// 원샷원틀
import java.io.*;
import java.util.*;
public class P1245 {
	static int n,m,i,j,a[][],R,p[]= {1,1,1,0,0,-1,-1,-1},q[]= {1,0,-1,1,-1,-1,0,1},h[][];
	static boolean C;
	static boolean o(int x,int y,int v,int f) {
//		System.out.print(String.format("x:%d y:%d v:%d\t",x,y,v));
		h[x][y]++;
		int i=0,X,Y;
		boolean c=true;
		for(;i<8;) {
			X=x+p[i];
			Y=y+q[i++];
			if(X>=0&X<n&Y>=0&Y<m)
				if(a[X][Y]>v) {
					c=false;
					if(h[X][Y]<1)o(X,Y,a[X][Y],1);
				}else if(a[X][Y]==v) {
					if(h[X][Y]<1)c=c&o(X,Y,v,0);
				}
		}
//		System.out.println("re "+c);
		if(f>0&c) {
//			System.out.println("\no in "+x+","+y+" re:"+c);
			R+=c?1:0;
		}
		return c;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		a=new int[n][m];
		h=new int[n][m];
		for(;i<n;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<m;a[i][j++]=Integer.parseInt(t.nextToken()));
		}
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(h[i][j]<1) {
//					System.out.println("o in "+i+","+j);
					C=o(i,j,a[i][j],1);
//					System.out.println("o in "+i+","+j+" re:"+C);
//					for(int[]b:h)System.out.println(Arrays.toString(b));
				}
			}
		}
		System.out.println(R);
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