package BaekJoon;

import java.util.Scanner;

public class P2740_2 {
	//¼öÇÐÇÏ¸é ¤¸µÊ¤©¤·
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[][]=new int[n][m],b[][],k;
		for(int i=0;i<n;i++)for(int j=0;j<m;j++)a[i][j]=s.nextInt();
		s.next();
		k=s.nextInt();
		b=new int[m][k];
		for(int i=0;i<m;i++)for(int j=0;j<k;j++)b[i][j]=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				int r=0,y=j;
				for(int x=0;x<m;x++) {
					r+=a[i][x]*b[x][j];
				}
				System.out.print(r+" ");
			}
			System.out.println();
		}
	}

}
