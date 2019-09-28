package BaekJoon;

import java.util.Scanner;

public class P1976 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		boolean[][] a=new boolean[m][m];
		for(int i=0;i<n;i++) 
			for(int j=0;j<n;j++)
				a[i][j]=s.nextInt()==1;
		s.nextLine();
		String[]b=s.nextLine().split(" ");
		
	}

}
