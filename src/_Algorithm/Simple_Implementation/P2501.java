package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P2501 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,r=0;
		for(;i++<n&r<3;)if(n%i==0)r++;
		System.out.println(r<3?0:i);
	}

}
