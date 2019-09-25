package BaekJoon;

import java.util.Scanner;

public class P17413_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] arr=s.nextLine().split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].charAt(0)=='<') {
				boolean c=false;
				StringBuilder sb=new StringBuilder();
				System.out.println(sb.length());
				for(int k=0;k<arr[i].length();k++) {
					
				}
			}
			else {
				for(int j=arr[i].length()-1;j>=0;j--) {
					System.out.print((char)arr[i].charAt(j));
				}
				System.out.print(" ");
			}
		}
	}

}