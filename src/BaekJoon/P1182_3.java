package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1182_3 {

	static int t,r=0,a[],n;
	
	static void sol(int i,int s) {
		if(i>=n)return;
		if(s+a[i]==t)r++;
		sol(i+1,s);
		sol(i+1,s+a[i]);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		t=s.nextInt();
		for(int i=0;i<n;i++)a[i]=s.nextInt();
		Arrays.sort(a);
		sol(0,0);
		System.out.println(r);
	}

}