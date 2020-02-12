package BaekJoon;

import java.util.Scanner;

public class P11724_C {
	static int n,m,a[][],h[],x,y,t=1;
	static void D(int i,int c) {
		h[i]=c;
		for(int j=1;j<n;j++)if(a[i][j]==1&&h[j]==0)D(j,c);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		m=s.nextInt();
		a=new int[n][n];
		h=new int[n];
		for(;m-->0;x=s.nextInt(),y=s.nextInt(),a[x][y]=a[y][x]=1);
		for(m=1;m<n;m++)if(h[m]==0)D(m,t++);
		System.out.println(t-1);
	}
}