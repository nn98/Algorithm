package _Algorithm.Sorting;

import java.util.Scanner;

public class Heap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=1,c=2;
		if(n>1)for(;n>c+1;c*=2);
		System.out.println(c+1);
	}
}