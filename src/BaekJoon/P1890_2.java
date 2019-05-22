package BaekJoon;

import java.util.Scanner;

public class P1890_2 {
	
	static void sol() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[][] arr=new int[N][N];
		long [][] c=new long[N][N];
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++) 
				arr[i][j]=s.nextInt();
		long r=0;
		int i=0,j=0;
		while(true) {
			if(arr[i+arr[i][j]][j]==0) c[i][j]=1;
		}
	}
}