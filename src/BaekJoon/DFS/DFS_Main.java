package BaekJoon.DFS;

import java.util.Scanner;

public class DFS_Main {

	static int n,m,i,j,r;
	static boolean a[][],h[];

	static void o(int x,StringBuffer f) {
		if(h[x])return;
		h[x]=true;
		r++;
		f.append(x+" ");
		int y=0,c=0;
		for(;++y<n;) {
			if(a[x][y])
				if(h[y])continue;
				else {
					c++;
					o(y,new StringBuffer(f));
				}
		}
		if(c==0)System.out.println(f);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		m=s.nextInt();
		a=new boolean[n][n];
		h=new boolean[n];
		for(;m-->0;i=s.nextInt(),j=s.nextInt(),a[i][j]=a[j][i]=true);
		for(m=0;++m<n;r=0,o(m,new StringBuffer()),System.out.println(r),h=new boolean[n]);
	}
}