package BaekJoon;

import java.util.Scanner;

public class P5524 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) {
			char[] arr=s.nextLine().toCharArray();
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>64&&arr[j]<92) System.out.print((char)(arr[j]+32));
				else System.out.print((char)arr[j]);
			}
			System.out.println();
		}
	}

}
