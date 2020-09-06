package _Algorithm;

import java.util.Scanner;

public class Test {

	static int n,m,i,j,k,a[],h[];
	
	static void o(int x,int c) {
		
		if(c==n) {
			for(int b:a)
				System.out.print(b+" ");
			System.out.println();
		}
		
		else {
			for(int y=0;y<n;a[x]=(char)y++,o(x+1,c+1));
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
//		BackTracking Test

		System.out.print("Number :\t");
		n=s.nextInt();

		System.out.print("Number :\t");
		m=s.nextInt();
		
		a=new int[n];
		
		for(;i<n;h=new int[n],o(i++,0));
		
	}

}
