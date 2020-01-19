package BaekJoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class P5568 {
	
	static String[]a;
	static int n,i=0;
	static HashSet<String> s=new HashSet();
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		a=new String[n=s.nextInt()];
		for(i=s.nextInt();n>0;a[--n]=s.next());
		System.out.println(Arrays.toString(a));
	}
}