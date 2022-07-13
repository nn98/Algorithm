package _Algorithm.DP;

import java.util.Arrays;
import java.util.Scanner;

public class P6221 {
	static int n,m,i,j,a[][],h[];
	static void o(int x) {
		System.out.println(x+" "+a[x][0]+" "+a[i][1]);
		for(int i=0;i<n;i++) {
			System.out.println(String.format("%d %d", a[i][0],a[i][1]));
			if(a[i][0]>a[x][0]&a[i][1]>a[x][1])h[x]=h[i];
		}
		h[x]++;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n][2];
		h=new int[n];
		for(;i<n;a[i][0]=s.nextInt(),a[i++][1]=s.nextInt());
		for(;i-->0;o(i));
		System.out.println(Arrays.toString(h));
	}

}
