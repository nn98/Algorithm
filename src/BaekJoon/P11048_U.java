package BaekJoon;

import java.util.Scanner;

public class P11048_U {
	//-1만 할때 || +1만 할때 크기 1 늘이기
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),a[][]=new int[x+1][y+1];
		for(int i=1;i<=x;i++)
			for(int j=1;j<=y;j++)
				a[i][j]=Math.max(a[i-1][j],a[i][j-1])+s.nextInt();
		System.out.print(a[x][y]);
	}
}
