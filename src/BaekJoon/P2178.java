package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2178 {

	static int x,y,a[][],h[][],i=0,j,r=99999,X[]= {1,0,-1,0},Y[]= {0,1,0,-1};
	static void o(int p,int q,int c) {
		System.out.println(p+" "+q);
		if(p==x&&q==y) {
			r=r<c?r:c;
			return;
		}
		h[p][q]=c;
		int k=0,P,Q;
		for(;k<4;k++) {
			P=p+X[k];
			Q=q+Y[k];
			if(a[P][Q]==49)
				if((h[P][Q]>c)||(h[P][Q]==0))
					o(P,Q,c+1);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		a=new int[x+2][y+2];
		h=new int[x+2][y+2];
		for(;i++<x;) {
			j=1;
			for(char k:s.next().toCharArray())
				a[i][j++]=k;
		}
		for(int[]k:a)
			System.out.println(Arrays.toString(k));
		o(1,1,1);
		System.out.println(r);
	}
}