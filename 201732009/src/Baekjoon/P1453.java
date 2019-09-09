package Baekjoon;

import java.util.Scanner;

public class P1453 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[]=new int[101],r=0;
		for(int i=0;i<n;i++) {
			int in=s.nextInt();
			if(arr[in]!=0) r++;
			else arr[in]=1;
		}
		System.out.println(r);
	}
}
