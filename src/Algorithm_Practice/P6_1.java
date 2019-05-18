package Algorithm_Practice;

import java.util.Scanner;

public class P6_1 {
	
	static int sol(int[] arr) {
		int count=0,max=4,another=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				if(another>=arr[i]) another-=arr[i];
				else {
					another+=max-arr[i];
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) arr[i]=s.nextInt();
		System.out.println(sol(arr));
	}

}
