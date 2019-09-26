package BaekJoon;

import java.util.Scanner;

public class P10984 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		double arr[]= {0,.7,1,1.3,1.7,2,2.3,2.7,3,3.3,3.7,4,4.3};
		for(int i=s.nextInt();i>0;i--) {
			int n=s.nextInt(),sum=0;
			double ave=0,r=0;
			for(int j=0;j<n;j++) {
				int l=s.nextInt();
				double f=s.nextDouble();
				sum+=l;
				ave+=l*f;
			}
			ave/=sum;
//			for(int j=0;j<arr.length;j++) if(arr[j]<=ave)r=arr[j]; 
			System.out.printf("%d %.1f",sum,ave);
		}
	}
}