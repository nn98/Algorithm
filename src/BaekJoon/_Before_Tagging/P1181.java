package BaekJoon._Before_Tagging;

import java.util.Scanner;

public class P1181 {

	static void swap(String[] arr,int i,int j) {
		String temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	static int partition(String[] a, int start, int end) {
		String value = a[end]; // ���ذ�
		int i = start - 1; // i�� 1������ ������
		for (int j = start; j <= end - 1; ++j) {// j�� 3������ ���� ����
			if (a[j].length()<value.length()) // a[j] ���� 1������ ���ϸ�
				swap(a, ++i, j); // a[j] ���� 1������ ���� �߰��Ѵ�. 1���� ũ�� 1����.
			else if (a[j].length()==value.length()) 
				if(a[j].compareTo(value)<0) 
					swap(a,++i,j);
		}
		swap(a, i + 1, end); // ���ذ��� a[end] ���ҿ� 2������ ���� ���Ҹ� ��ȯ�Ѵ�.
		return i + 1; // ���ذ� ��ġ ����
	}

	static void quickSort(String[] a, int start, int end) {
		if (start >= end) return;
		int middle = partition(a, start, end); // �迭 ������
		quickSort(a, start, middle-1); // 1���� ����
		quickSort(a, middle+1, end); // 2���� ����
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
