package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11650_3 {
	//³ë¾ç½É
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		String[] arr=new String[n];
		for(int i=0;i<n;i++) arr[i]=s.nextLine();
		Arrays.sort(arr);
		for(int i=0;i<n;i++) System.out.println(arr[i]);
	}
}