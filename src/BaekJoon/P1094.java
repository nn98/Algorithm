package BaekJoon;

import java.util.Scanner;

public class P1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a=64,count=0;
		while(n>0) {
			if(a>n) a/=2;
			else {
				count++;
				n-=a;
			}
		}
		System.out.println(count);
	}

}
