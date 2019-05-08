package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1181 {

	static void swap(String[] arr,int i,int j) {
		String temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	static int partition(String[] a, int start, int end) {
		String value = a[end]; // 기준값
		int i = start - 1; // i는 1구역의 끝지점
		for (int j = start; j <= end - 1; ++j) {// j는 3구역의 시작 지점
			if (a[j].length()<value.length()) // a[j] 값이 1구역에 속하면
				swap(a, ++i, j); // a[j] 값을 1구역의 끝에 추가한다. 1구역 크기 1증가.
			else if (a[j].length()==value.length()) 
				if(a[j].compareTo(value)<0) 
					swap(a,++i,j);
		}
		swap(a, i + 1, end); // 기준값인 a[end] 원소와 2구역의 시작 원소를 교환한다.
		return i + 1; // 기준값 위치 리턴
	}

	static void quickSort(String[] a, int start, int end) {
		if (start >= end) return;
		int middle = partition(a, start, end); // 배열 나누기
		quickSort(a, start, middle-1); // 1구역 정렬
		quickSort(a, middle+1, end); // 2구역 정렬
	}

	/*
	static void sol(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j].length()>arr[j+1].length()) swap(arr,j,j+1);
				else if (arr[j].length()==arr[j+1].length()) 
					if(arr[j].compareTo(arr[j+1])>0) 
						swap(arr,j,j+1);
			}
		}
	}
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		String[] arr=new String[N];
		for(int i=0;i<N;i++) arr[i]=s.next();
		quickSort(arr,0,arr.length-1);
		//System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i].compareTo(arr[i-1])==0) continue;
			System.out.println(arr[i]);
		}
	}
}
