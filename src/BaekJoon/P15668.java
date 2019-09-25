package BaekJoon;

import java.util.Scanner;

public class P15668 {

	static boolean sol(int a,int b) {
		int[] arr=new int[10];
		String[] brr=(""+a+b).split("");
		for(String i:brr) {
			int j=Integer.parseInt(i);
			if(arr[j]>0) return false;
			else arr[j]++;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(9999/2);
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<n/2;i++) {
			if(sol(i,n-i)) {
				System.out.println(i+" + "+(n-i));
				return;
			}
		}
		System.out.println(-1);
	}
}