package BaekJoon;

import java.util.Scanner;

public class P3059 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[],r,j;
		for(;n-->0;) {
			a=new int[91];
			for(char i:s.next().toCharArray())a[i]++;
			r=0;
			for(j=65;j<91;r+=a[j]==1?j:0);
			System.out.println(r);
		}
	}
}