package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1427 {

	static void swap(int[] arr,int i,int j) {
		int v=arr[i];
		arr[i]=arr[j];
		arr[j]=v;
	}

	static void sol(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) swap(arr,j,j+1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int a=1,b=10;
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=N%b/a;
			b*=10;
			a*=10;
		}
		//System.out.println(Arrays.toString(arr));
		sol(arr);
		//System.out.println(Arrays.toString(arr));
		/*
		int r=0,j=0;
		for(int i=1000000000;i>0;i/=10) {
			r+=arr[j]*i;
			j++;
		}
		 */
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) break;
			else {
				System.out.print(arr[i]);
			}
		}
		//System.out.println(Arrays.toString(arr));
	}
}