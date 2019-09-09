package Baekjoon;

import java.util.Scanner;

public class P2161 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[]=new int[n*2+1];
		for(int i=1;i<=n;i++) arr[i-1]=i;
		for(int i=0;arr[i]!=0;i+=2) {
			System.out.print(arr[i]+" ");
			arr[n++]=arr[i+1];
		}
	}
}
