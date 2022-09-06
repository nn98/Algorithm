package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P16431 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=s.nextInt(),j=s.nextInt(),x=s.nextInt(),y=s.nextInt(),
				a=Math.min(Math.abs(n-x),Math.abs(m-y)),b=Math.abs(i-x)+Math.abs(j-y);
		System.out.println(a+" "+b);
		
	}

}
