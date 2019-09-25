package Baekjoon;

import java.util.Scanner;

public class P15668 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[];
		boolean f=false;
		for(int i=1;i<n/2+1;i++) {
			int j=n-i;
			f=false;
			arr=new int[10];
			for(int k=1;k<=j;k*=10) {
				if(arr[j%(k*10)/k]!=0) {
					f=true;
					break;
				}
				else {
					arr[j%(k*10)/k]=1;
				}
			}
			if(f) continue;
			for(int k=1;k<=i;k*=10) {
				if(arr[i%(k*10)/k]!=0) {
					f=true;
					break;
				}
				else {
					arr[i%(k*10)/k]=1;
				}
			}
			if(f) continue;
			else {
				System.out.println(i+" + "+j);
				break;
			}
		}
		if(f) System.out.println(-1);
	}
}
