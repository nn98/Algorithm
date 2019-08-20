package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2981_2 {

	static long 최대공약수(long a, long b){
		while (b != 0) {
			long t = a % b;
			a = b;
			b = t;
		}
		return a;
	}

	static long 최대공약수(int... a) {
		long result = a[0];
		for (int i = 1; i < a.length; ++i)
			result = 최대공약수(result, a[i]);
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		int a=arr[0],rr[]=new int[a],index=0;
		for(int i=0;i<=a;i++) {
			int[] brr=new int[arr.length];
			for(int j=0;j<arr.length;j++) {
				brr[j]=arr[j]-i;
			}
			long r=최대공약수(brr);
			if(r!=1) rr[(int)r-1]=1;
		}
		for(int i=0;i<rr.length;i++) {
			if(rr[i]==1) System.out.print(i+1+" ");
		}
	}
}