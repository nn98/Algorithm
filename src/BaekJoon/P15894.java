package BaekJoon;

import java.util.Scanner;

public class P15894 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long sum=n;
		for(int i=0;i<n;i++) sum+=3;
		System.out.println(sum);
	}
}