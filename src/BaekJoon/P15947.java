package BaekJoon;

import java.util.Arrays;

public class P15947 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt();
		String r="ru",a[]="baby sukhwan tururu turu very cute tururu turu in bed tururu turu baby sukhwan".split(" "),b=a[n%14];
		System.out.println(b);
	}
}