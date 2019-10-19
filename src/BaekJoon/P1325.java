package BaekJoon;

import java.util.Scanner;

public class P1325 {
	static int n,a[][],m,x,y;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n][n];
		for(m=s.nextInt();m>0;m--) {
			x=s.nextInt()-1;
			y=s.nextInt()-1;
			a[x][y]++;
			a[y][x]++;
		}
	}
}