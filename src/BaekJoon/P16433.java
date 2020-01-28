package BaekJoon;

import java.util.Scanner;

public class P16433 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),x=s.nextInt()%2,y=s.nextInt()%2,i=0,j;
		for(;i++<n;) {
			for(j=0;j++<=n;) {
				System.out.print(n==j-1?"\n":((i%2^x)^(j%2^y))==1?"v":".");
			}
		}
	}
}
