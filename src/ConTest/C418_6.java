package ConTest;

import java.util.Scanner;

public class C418_6 {
	static int sol(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0||i%7==0) sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr= {3,6,7,9,12,14,15,18,21,0};
		for(int i=0;i<N;i++) {
			int n=s.nextInt();
			int count=n/21,ex=n%21,sum=0;
			for(int j=0;j<count;j++) {
				for(int k=0;k<arr.length;k++) sum+=21*j+arr[k];
			}
			for(int j=0;ex<arr[j];j++) {
				sum+=arr[j];
			}
			System.out.println(sum+" sol:"+sol(n));
		}
	}
}
