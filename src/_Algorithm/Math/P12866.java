package _Algorithm.Math;

import java.util.Scanner;
public class P12866 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long i=s.nextInt(),m=1000000007,a[]=new long[20];;
		for(char c:s.next().toCharArray())a[c-'A']++;
		i=a[0]%m;
		i=i*a[2]%m;
		i=i*a[6]%m;
		System.out.print(i*a[19]%m);
	}
}
