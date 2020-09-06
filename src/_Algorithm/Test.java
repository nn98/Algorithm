package _Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

//	20-09-06 BackTraking
	
	static int n,m,i,j,k,a[],h[];
	
//	Duplicate
	
	static void o(int x) {
		
		if(x==m) {
			for(int b:a)
				System.out.print(b+" ");
			System.out.println();
		}
		
		else {
			for(int y=0;y<n;a[x]=++y,o(x+1));
		}
		
	}
	
//	N-Duplicate
	
	static void p(int x) {

		System.out.println("a "+Arrays.toString(a));
		System.out.println("h "+Arrays.toString(h));

		if(x==m) {
			for(int b:a)
				System.out.print(b+" ");
			System.out.println();
		}
		
		else {
			for(int y=1;y<=n;y++) {
				if(h[y]>0)continue;
				a[x]=y;
				h[y]=1;
				p(x+1);
				h[y]=0;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
//		1

		System.out.print("Number:\t");
		n=s.nextInt();

		System.out.print("Count:\t");
		m=s.nextInt();
		
		a=new int[n];
		
		h=new int[n+1];
		
		o(0);
		
		System.out.println();
		
		p(0);
		
	}

}
