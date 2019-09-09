package BaekJoon;

import java.util.Scanner;

public class P11648_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),sum=0;
		for(;n>=10;sum++) {
			String[] arr=(""+n).split("");
			n=1;
			for(String i:arr) n*=Integer.parseInt(i); 
		}
		System.out.println(sum);
	}
}
