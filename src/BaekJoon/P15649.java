package BaekJoon;

import java.util.Scanner;

public class P15649 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),f=1,i=2;
		for(;i<=n;i++)f*=i;
		for(i=n-m;i>1;i--)f/=i;
		StringBuffer[]a=new StringBuffer[f];
	}
}