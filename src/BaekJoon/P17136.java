package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P17136 {

	static int r=0,A[][]=new int[10][10],k[]= {0,5,5,5,5,5};
	static boolean C=true;
	static void o(int i,int j) {
//		System.out.println(i+" "+j+" "+A[i][j]);
		int t=1,d=0;
		for(int a=0;a<4;a++) {
			boolean c=true;
			for(int x=i;x<=i+t&&x<10;x++) {
				for(int y=j;y<=j+t&&y<10;y++) {
//					System.out.println("\t"+x+" "+y);
					if(A[x][y]==0) {
						c=false;
						break;
					}
					if(!c)break;
				}
				if(!c)break;
			}
			if(!c)break;
			t++;
		}
		for(int x=i;x<=i+t-1&&x<10;x++)
			for(int y=j;j<=j+t-1&&y<10;y++)
				if(A[x][y]==1)A[x][y]=0;
		r+=t;
		if(k[t]==0) {
			C=false;
			r=-1;
			return;
		}
		k[t]--;
//		System.out.println(i+" "+j+" "+A[i][j]+" "+t);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				A[i][j]=s.nextInt();
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				if(A[i][j]==1)
					o(i,j);
//		for(int i=0;i<10;i++)
//			System.out.println(Arrays.toString(A[i]));
		System.out.println(r);
	}

}
