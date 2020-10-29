package _Algorithm.Sweeping;

import java.util.Arrays;
import java.util.Scanner;

public class P1645 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,a[]=new int[n],t[]=new int[n],j=0;
		while(i<n)a[i++]=s.nextInt();
		Arrays.sort(a);
		i=0;
		while(i<n) {
			if(a[i]<=i)break;
			i++;
		}
		System.out.println(i==n?0:i);
	}

}
