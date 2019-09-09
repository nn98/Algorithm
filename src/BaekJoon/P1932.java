package BaekJoon;

import java.util.Scanner;

public class P1932 {

	static int arr[][],brr[][];

	static int cL(int i,int j) {
		if(brr[i][j]!=0) return brr[i][j];
//		System.out.println("i :"+i+" j :"+j);
		if(i==arr.length-2) brr[i][j]=arr[i+1][j]>=arr[i+1][j+1]?arr[i+1][j]:arr[i+1][j+1];
		else brr[i][j]=cL(i+1,j)>=cL(i+1,j+1)?cL(i+1,j):cL(i+1,j+1);
		brr[i][j]+=arr[i][j];
		//		System.out.println("i :"+i+" j :"+j+" re "+brr[i][j]);
		return brr[i][j];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		arr=new int[N][];
		brr=new int[N][];
		for(int i=0;i<N;i++) {
			arr[i]=new int[i+1];
			brr[i]=new int[i+1];
			for(int j=0;j<=i;j++) arr[i][j]=s.nextInt();
		}
		cL(0,0);
		System.out.println(brr[0][0]);
	}
}