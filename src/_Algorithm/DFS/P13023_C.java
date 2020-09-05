package _Algorithm.DFS;

import java.util.Scanner;

public class P13023_C {

	static int n,m,a,b,v[][],h[];
	static void o(int i,int x) {
		h[i]=1;
		if(x>3) {
			System.out.print(1);
			System.exit(0);
		}
		for(int j=0;j<n;j++) {
			if(v[i][j]>0)
				o(j,x+1);
		}
		h[i]=0;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		h=new int[n];
		v=new int[n][n];
		m=s.nextInt();
		while(m-->0) {
			a=s.nextInt();
			b=s.nextInt();
			v[a][b]=v[b][a]=1;
		}
		for(;++m<n;o(m,0));
	}

}
