package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11055_2 {

	static int n,arr[],history[],max=0;
	static void sol(int i,int sum) {
		if(i>=n) return;
		history[i]=sum+arr[i];
		if(max<history[i]) max=history[i];
		for(int j=i+1;j<n;j++) {
			if(arr[j]>arr[i]) {
				if(history[j]<history[i]+arr[j])
					sol(j,history[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		arr=new int[n];
		history=new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		for(int i=0;i<n;i++)
			sol(i,0);
//		System.out.println(Arrays.toString(history));
//		for(int i:history) max=max>i?max:i;
		System.out.println(max);
	}
}
