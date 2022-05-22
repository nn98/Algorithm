package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10817 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[3];
		arr[0]=s.nextInt();
		arr[1]=s.nextInt();
		arr[2]=s.nextInt();
		Arrays.sort(arr);
		System.out.print(arr[1]);
	}

}
