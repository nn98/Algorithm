package _Algorithm.DFS;

import java.util.Scanner;

public class P1325_2 {
	static int n,m,i,j,r;
	static boolean[]a[],h,f;

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
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		m=s.nextInt();
		a=new boolean[n][n];
		h=new boolean[n];
		f=new boolean[n];
		for(;m-->0;i=s.nextInt(),j=s.nextInt(),a[j][i]=true);
		i=0;
		for(m=0;++m<n;h=new boolean[n]) {
			r=0;
			o(m,new StringBuffer());
			if(r>i) {
				f=new boolean[n];
				f[m]=true;
				i=r;
			}else if(r==i)f[m]=true;
		}
		for(i=0;++i<n;System.out.print(f[i]?i+" ":""));
	}
}