package _Algorithm.Sorting;

import java.util.Scanner;

public class Heap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=1,c=0;
		if(n>1)for(;n>Math.pow(2,++c)+1;);
		System.out.println(Math.pow(2,c)+1);
	}

}
