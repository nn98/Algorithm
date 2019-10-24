package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1937_Time3 {
	//이 방식이 더 효율이 좋네? 시발? 왜?
	static int n,a[][],r=0,i=1,j,h[][],p[]= {1,0,-1,0},q[]= {0,1,0,-1};
	static int o(int x,int y) {
		if(h[x][y]!=0)return h[x][y];
		int v=1;
		for(int k=0;k<4;k++) {
			int X=x+p[k],Y=y+q[k];
			if(X>0&&X<n+1&&Y>0&&Y<n+1) {
				if(a[X][Y]>a[x][y]) {
					v=Math.max(v,o(X,Y)+1);
					h[x][y]=v;
				}
			}
		}
		return v;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(b.readLine());
		a=new int[n+2][n+2];
		h=new int[n+2][n+2];
		for(;i<n+1;i++) {
			StringTokenizer st=new StringTokenizer(b.readLine());
			for(j=1;j<n+1;j++)
				a[i][j]=Integer.parseInt(st.nextToken());
		}
		//		for(i=0;i<n+2;i++)
		//			System.out.println(Arrays.toString(a[i]));
		for(i=1;i<n+1;i++) {
			for(j=1;j<n+1;j++) {
				r=Math.max(r, o(i,j));
			}
		}
		//		for(i=0;i<n+2;i++)
		//			System.out.println(Arrays.toString(h[i]));
		System.out.print(r);
	}
}