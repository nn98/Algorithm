package _Algorithm.Sorting;

import java.util.Scanner;

public class Heap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),l=3,c=4;
		if(n>1)for(;n>l;l+=c,c*=2);
		System.out.println(l);
	}
}
