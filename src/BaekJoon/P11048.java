package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11048 {

	static int x,y,a[][],d[][];
	static void sol(int i,int j) {
		if(i<x&&j<y) {
			if(i==x-1&&j==y-1)d[i][j]=a[i][j];
			else {
				int k=0,b=0,c=0;
				if(i+1<x&&j+1<y) {
					if(d[i+1][j+1]<0)
						sol(i+1,j);
					k=d[i+1][j+1];
				}
				if(i+1<x) {
					if(d[i+1][j]<0)
						sol(i+1,j);
					b=d[i+1][j];
				}
				if(j+1<y) {
					if(d[i][j+1]<0)
						sol(i,j+1);
					c=d[i][j+1];
				}
				d[i][j]=a[i][j]+(k>(b>c?b:c)?k:(b>c?b:c));
//				Math.max(a,Math.max(b,c));
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		a=new int[x][y];
		d=new int[x][y];
		for(int i=0;i<x;i++)
			for(int j=0;j<y;j++)
				a[i][j]=s.nextInt();
		for(int i=0;i<x;i++)
			Arrays.fill(d[i],-1);
		sol(0,0);
		System.out.print(d[0][0]);
	}
}