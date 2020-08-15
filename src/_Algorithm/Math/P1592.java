package _Algorithm.Math;

import java.util.Scanner;

public class P1592 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),u=s.nextInt(),a[]=new int[n],r=-1,i=0;
		while(true) {
			System.out.println(i);
			a[i]++;
			r++;
			if(a[i]==m) {
				System.out.println(r);
				return;
			}
			System.out.println("\t"+a[i]);
			i+=u*(a[i]%2==0?-1:1);
			if(i<0)i=n+i;
			else if(i>=n)i-=n;
		}
	}
}