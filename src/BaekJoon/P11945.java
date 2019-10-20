package BaekJoon;

import java.util.Scanner;

public class P11945 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),a[][]=new int[n][m],i=0,j;
		for(;i<n;i++) {
			j=0;
			for(char c:s.next().toCharArray())
				a[i][j++]=c-'0';
		}
	}

}
