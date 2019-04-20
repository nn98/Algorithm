package Algorithm_02;

import java.util.Scanner;
public class Example6 {
	static void print1(int n) {
		for(int i=1;i<n+1;i++) {
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			for(int j=i;j>0;j--)
				System.out.print("*");
			System.out.println();
		}
	}
	static void print2(int n, int i, int j) {
		if(i==n||j==n) return;
		if(i+j>=n-1) System.out.print("*");
		else System.out.print(" ");
		print2(n,i+1,j);
		if(i==0) {
			System.out.println();
			print2(n,i,j+1);
		}
	}
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("행 수를 입력하시오: ");
			int n = scanner.nextInt();
			print1(n);
			System.out.println();
			print2(n, 0, 0);
		}
	}
}