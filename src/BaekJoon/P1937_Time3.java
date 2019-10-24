package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1937_Time3 {

	static int n,a[][],r=0,i=0,j,h[][],p[]= {1,0,-1,0},q[]= {0,1,0,-1};
	static int o(int x,int y) {
		if(h[x][y]!=0)return h[x][y];
		int v=1;
		for(int k=0;k<4;k++) {
			int X=x+p[k],Y=y+q[k];
			if(X>=0&&X<n&&Y>=0&&Y<n) {
				if(a[X][Y]>a[x][y]) {
					v=Math.max(v,o(X,Y)+1);
					h[x][y]=v;
				}
			}
		}
		return v;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		long A=System.currentTimeMillis();
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(b.readLine());
		a=new int[n][n];
		h=new int[n][n];
		for(;i<n;i++) {
			StringTokenizer st=new StringTokenizer(b.readLine());
			for(j=0;j<n;j++)
				a[i][j]=Integer.parseInt(st.nextToken());
		}
		//		for(i=0;i<n+2;i++)
		//			System.out.println(Arrays.toString(a[i]));
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				r=Math.max(r, o(i,j));
			}
		}
		//		for(i=0;i<n+2;i++)
		//			System.out.println(Arrays.toString(h[i]));
		System.out.println(System.currentTimeMillis()-A);
		System.out.print(r);
	}
}