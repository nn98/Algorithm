package _Algorithm.BFS;
import java.io.*;
import java.util.*;
public class P21736 {
	static int n,m,i,j,h[][],p[]= {0,1,0,-1},q[]= {1,0,-1,0},R;
	static char[][]a;
	static void o(int x,int y) {
//		System.out.println(x+" "+y);
		h[x][y]++;
		if(a[x][y]=='P')R++;
		int i=0,X,Y;
		for(;i<4;i++) {
			X=x+p[i];
			Y=y+q[i];
			if(X>=0&X<n&Y>=0&Y<m)if(a[X][Y]!='X'&h[X][Y]<1)o(X,Y);
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]b=r.readLine().split(" ");
		n=Integer.parseInt(b[0]);
		m=Integer.parseInt(b[1]);
		a=new char[n][];
		h=new int[n][m];
		for(;i<n;a[i++]=r.readLine().toCharArray());
		for(;j<n;j++)for(i=0;i<m;i++)if(a[j][i]=='I')o(j,i);
//		for(int[]c:h)System.out.println(Arrays.toString(c));
		System.out.println(R<1?"TT":R);
	}
}
