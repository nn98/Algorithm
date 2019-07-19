package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11053 {

	static int[] arr,history;

	static int sol(int index,int sum) {
		for(int i=index+1;i<arr.length;i++) {
			if(arr[i]>arr[index]) {
				int r=sol(i,sum);
				history[index]=++r;
				return history[index];
			}
		}
		history[index]=++sum;
		return history[index];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		arr=new int[n];
		history=new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		for(int i=0;i<n;i++) sol(i,0);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(history));
		int r=0;
		for(int i=0;i<history.length;i++) if(history[i]>r)r=history[i];
		System.out.println(r);
	}
}
