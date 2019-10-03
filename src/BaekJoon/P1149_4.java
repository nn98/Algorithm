package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;
//One try gg
public class P1149_4 {

	static int h[][],a[][],n;
	
//	static int sol(int p,int c) {
//		if(p==n-2) {
//			
//		}
//	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		h=new int[n][3];
		a=new int[n][3];
		for(int i=0;i<n;i++) for(int j=0;j<3;j++)a[i][j]=s.nextInt();
		for(int i=0;i<3;i++) h[n-1][i]=a[n-1][i];
		for(int i=n-2;i>=0;i--) {
			h[i][0]=Math.min(h[i+1][1],h[i+1][2])+a[i][0];
			h[i][1]=Math.min(h[i+1][0],h[i+1][2])+a[i][1];
			h[i][2]=Math.min(h[i+1][1],h[i+1][0])+a[i][2];
		}
//		for(int i=0;i<n;i++) System.out.println(Arrays.toString(h[i]));
		System.out.println(Math.min(Math.min(h[0][0],h[0][1]),h[0][2]));
	}

}
