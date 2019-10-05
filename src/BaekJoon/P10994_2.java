package BaekJoon;

import java.util.Arrays;

public class P10994_2 {

	static int n=new java.util.Scanner(System.in).nextInt(),t=n*2-2;
	static char[][]a=new char[1+(n-1)*4][1+(n-1)*4];
	static void sol(int p) {
		int x=t-p,y=t+p;
//		System.out.println(x+" "+y);
		for(int i=x;i<=y;i++) {
			a[x][i]='*';
			a[i][x]='*';
		}
		for(int i=y;i>x;i--) {
			a[y][i]='*';
			a[i][y]='*';
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(t);
		if(n==1)System.out.println("*");
		else {
			for(int i=0;i<=n*2-2;i+=2) {
				sol(i);
			}
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++)
					System.out.print(a[i][j]=='*'?"*":" ");
				System.out.println();
			}
//			for(int i=0;i<a.length;i++) {
//					System.out.println(Arrays.toString(a[i]));
//			}
		}
		
	}

}
