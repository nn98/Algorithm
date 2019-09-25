package BaekJoon;

import java.util.Scanner;

public class P11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[]=new int[1001],sum=0,r=0;
		for(int i=0;i<n;i++) arr[s.nextInt()]++;
		for(int i=0;i<arr.length;i++) {
			while(arr[i]>0) {
//				System.out.println(sum+i);
				sum=sum+i;
				r+=sum;
				arr[i]--;
			}
		}
		System.out.println(r);
	}

}
