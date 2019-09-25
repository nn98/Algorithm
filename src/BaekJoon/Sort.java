package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	
//	static int[] arr;
	
	static void swap(int arr[],int i,int j) {
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	
	static void sol(int arr[],int c) {
		switch(c) {
		case 1:
			System.out.println("Bubble");
			bubble(arr);
			break;
		case 2:
			System.out.println("Select");
			select(arr);
			break;
		}
	}
	static void bubble(int arr[]) {
		boolean c=false;
		for(int i=0;i<arr.length-1;i++) {
//			System.out.println(Arrays.toString(arr));
			if(c) break;							//efficiency up
			c=true;
			for(int j=0;j<arr.length-(1+i);j++) {	//efficiency up
				if(arr[j]>arr[j+1]) {
					c=false;
					swap(arr,j,j+1);
				}
			}
		}
	}
	static void select(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) if(arr[index]>arr[j]) index=j;
			swap(arr,i,index);
		}
	}
	//+
	static void merge(int arr[]) {
		
	}
	static void quick(int arr[]) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		System.out.println(Arrays.toString(arr));
		sol(arr,2);
		System.out.println(Arrays.toString(arr));
	}

}
