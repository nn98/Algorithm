package BaekJoon;

import java.util.Scanner;

public class P10808 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String in=s.next();
		int[] arr=new int[26];
		for(int i=0;i<in.length();i++) arr[in.charAt(i)-'a']++;
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
	}
}
