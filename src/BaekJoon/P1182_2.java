package BaekJoon;

import java.util.Scanner;

public class P1182_2 {
	static int t,r=0,arr[];
	static void sol(int start) {
		int sum=arr[start];
		for(int i=start+1;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==t) {
				r++;
				return;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		t=s.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		for(int i=0;i<arr.length;i++) sol(i);
		System.out.println(r);
	}
}