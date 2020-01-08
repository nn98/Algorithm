package BaekJoon;

import java.io.*;
import java.util.*;
public class P5573_2{
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		int x=Integer.parseInt(t.nextToken()),y=Integer.parseInt(t.nextToken()),n=Integer.parseInt(t.nextToken()),a[][]=new int[1001][1001],i=0,j
				,dp[][]=new int[x+1][y+1],pX[]= {1,0},pY[]= {0,1};
		for(;i<x;i++) {
			t=new StringTokenizer(r.readLine());
			for(j=0;j<y;a[i][j++]=Integer.parseInt(t.nextToken()));
		}
		dp[0][0] = n - 1;

		for (i = 0; i < x; i++) {
			for (j = 0; j < y; j++) {
				dp[i][j + 1] += a[i][j]%2==1? (dp[i][j] + 1) / 2 : dp[i][j] - ((dp[i][j] + 1) / 2);
				dp[i + 1][j] += a[i][j]%2==1? dp[i][j] - ((dp[i][j] + 1) / 2) : (dp[i][j] + 1) / 2;
			}
		}
		for (i = 0; i < x; i++) {
			for (j = 0; j < y; j++) {
				a[i][j] += dp[i][j];
			}
		}

		int resX = 0, resY = 0;
		while (0 <= resX && resX < x && 0 <= resY && resY < y) {
			int move = a[resX][resY] & 1;
			resX += pX[move]; resY += pY[move];
		}
		System.out.print(x+1+" "+(y+1));
	}
}