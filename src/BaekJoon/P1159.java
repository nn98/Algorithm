package BaekJoon;

import java.util.Scanner;

public class P1159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[26];
		for(int i=0;i<N;i++) arr[s.next().charAt(0)-97]++;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>4)
				System.out.printf("%c",i+97);
		}
	}

}
