package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1325 {
	static int n,a[][],m,x,y,M=0,N=0,p[];
	static boolean d[];
	static void sol(int i) {
		d[i]=true;
		for(int j=0;j<a[i].length;j++) {
			if(a[i][j]>0) {
				if(d[j])continue;
				if(p[j]>0)M+=p[j];
				else {
					sol(j);
					M++;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n][n];
		p=new int[n];
		for(m=s.nextInt();m>0;m--) {
			x=s.nextInt()-1;
			y=s.nextInt()-1;
			//			a[x][y]++;
			a[y][x]++;
		}
		for(int i=0;i<n;i++) {
			d=new boolean[n];
			sol(i);
			p[i]=M;
			N=N>M?N:M;
		M=0;
		}
		for(int i=0;i<n;i++)if(p[i]==N)System.out.print(i+1+" ");
	}
}