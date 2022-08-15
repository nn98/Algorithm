package _Algorithm.Math;

import java.util.Arrays;
import java.util.Scanner;

public class P12866 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt(),a[]=new int[20],m=1000000007;
		for(char c:s.next().toCharArray())a[c-'A']++;
		System.out.println(Arrays.toString(a));
		i=a[0]%m;
		i=i*a[2]%m;
		i=i*a[6]%m;
		System.out.print(i*a[19]%m);
	}

}
