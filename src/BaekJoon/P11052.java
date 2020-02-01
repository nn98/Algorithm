package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11052 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n+1],i=0;
		for(;i++<n;a[i]=s.nextInt());
		System.out.println(Arrays.toString(a));
	}

}
