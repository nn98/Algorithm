package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2750 {

	static void sort(int[] arr,int f,int t) {
		if(f==t) return;
		int m=(f+t)/2;
		sort(arr,f,m);
		sort(arr,m+1,t);
		merge(arr,f,m,t);
	}

	static void merge(int[] arr,int a1,int m,int a2) {
		System.out.println(Arrays.toString(arr));
		int[] arr1=new int[a2];
		int b1=a1,b2=m,i=0;
		for(;b1<=m&&b2<=a2;i++) arr1[i]=arr[b1]<arr[b2]?arr[b1++]:arr[b2++];
		for(;b1<=m;b1++) arr1[i++]=arr[b1];
		for(;b2<=a2;b2++) arr1[i++]=arr[b2];
		System.out.println("a1: "+a1+" m: "+m+" a2: "+a2);
		for(i=0;i<arr1.length;i++) arr[a1++]=arr1[i];
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) arr[i]=s.nextInt();
		sort(arr,0,arr.length-1);
		for(int i=0;i<N;i++) System.out.println(arr[i]);
	}

}
