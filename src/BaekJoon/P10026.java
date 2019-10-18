package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10026 {

	static char[][]a;
	static boolean[][]p,q;
	static int n,P=0,Q=0,x[]= {1,0,-1,0},y[]= {0,1,0,-1};
	static void sol(int i,int j) {
		p[i][j]=true;
		char t=a[i][j];
		for(int k=0;k<4;k++) {
			int I=i+x[k],J=j+y[k];
			if(I>=0&&I<n&&J>=0&&J<n) {
				if(a[I][J]==t&&!p[I][J])
					sol(I,J);
			}
		}
	}
	static void sol2(int i,int j) {
//		System.out.println(i+" "+j+" "+a[i][j]);
		q[i][j]=true;
		char t=a[i][j];
		if(t=='B') {
			for(int k=0;k<4;k++) {
				int I=i+x[k],J=j+y[k];
				if(I>=0&&I<n&&J>=0&&J<n) {
					if(a[I][J]==t&&!q[I][J])
						sol2(I,J);
				}
			}
		}
		else {
			for(int k=0;k<4;k++) {
				int I=i+x[k],J=j+y[k];
				if(I>=0&&I<n&&J>=0&&J<n) {
					if((a[I][J]=='R'||a[I][J]=='G')&&!q[I][J])
						sol2(I,J);
				}
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new char[n][];
		p=new boolean[n][n];
		q=new boolean[n][n];
		for(int i=0;i<n;i++)a[i]=r.readLine().toCharArray();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(!p[i][j]) {
					sol(i,j);
					P++;
				}
				if(!q[i][j]) {
					sol2(i,j);
					Q++;
				}
			}
		}
//		for(int i=0;i<n;i++)System.out.println(Arrays.toString(p[i]));
//		for(int i=0;i<n;i++)System.out.println(Arrays.toString(q[i]));
		System.out.println(P+" "+Q);
	}
}