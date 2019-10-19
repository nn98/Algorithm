package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1325_5 {
	static int n,D[],p=0;
	static boolean N[][],H[];
	static void o(int i) {
		int u=1;
		for(int j=0;j<n;j++) {
			if(N[i][j]) {
				if(D[j]==0)o(j);
				u+=D[j];
			}
		}
		D[i]=u;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		D=new int[n];
		N=new boolean[n][n];
		for(int m=s.nextInt();m>0;m--) {
			int x=s.nextInt()-1,y=s.nextInt()-1;
			N[y][x]=true;
		}
		for(int i=0;i<n;i++) {
			if(D[i]==0)o(i);
			p=p>D[i]?p:D[i];
		}
		for(int i=0;i<n;i++)
			if(D[i]==p)
				System.out.print(i+1+" ");
	}
}