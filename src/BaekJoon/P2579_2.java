package BaekJoon;

import java.util.Scanner;

public class P2579_2 {

	static int N,r=0;
	static int[] arr;
	
	static void sol(int num,int c) {
		System.out.println(arr[num]);
		r+=arr[num];
		if(num==arr.length-1) return;
		if(num==arr.length-2&&c!=1) sol(num+1,1);
		if(c==1) sol(num+2,0);
		else {
			if(arr[num+1]>arr[num+2]) sol(num+1,c++);
			else sol(num+2,0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		arr=new int[N];
		for(int i=0;i<N;i++) arr[i]=s.nextInt();
		sol(0,-1);
		System.out.println(r);
	}

}
