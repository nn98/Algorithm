package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0]*arr[arr.length-1]);
	}
}