package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[] arr=s.nextLine().toCharArray();
		int[] r=new int[26];
		for(int i=0;i<r.length;i++) r[i]=-1;
		for(int i=arr.length-1;i>=0;i--) r[(int)arr[i]-97]=i;
		for(int i=0;i<r.length;i++) System.out.print(r[i]+" ");
	}

}
