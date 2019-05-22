package BaekJoon;

import java.util.Scanner;

public class P2579 {
	
	static int r=0;
	static int[] arr;
	
	static void sol(int number,int c) {
		if(number<0) return;
		r+=arr[number];
		System.out.println(number+" , c: "+c+" val: "+arr[number]+" r: "+r);
		if(number-2<0) {
			if(c==0)
				sol(number-1,1);
			else
				return;
		}
		else if(c==1) sol(number-2,0);
		else {
			if(arr[number-2]>arr[number-1]) sol(number-2,0);
			else if(c==1) sol(number-2,0);
			else sol(number-1,1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		arr=new int[N];
		for(int i=0;i<N;i++) arr[i]=s.nextInt();
		sol(N-1,0);
		System.out.println(r);
	}
}