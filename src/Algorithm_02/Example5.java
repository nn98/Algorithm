package Algorithm_02;

import java.util.Scanner;

public class Example5 {
	static void print1(int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j <= i; ++j)
				System.out.print("*");
			System.out.println();
		}
	}
	static void print2(int n, int i, int j) {
		/*	??? 거꾸로됨
		if(i==n||j==n) return;
		if(i<n)
			System.out.print("*");
		print2(n,i+1,j+1);
		if(j==0) {
			System.out.println();
			print2(n,i+1,j);
		}
		 */
		if(i==n||j==n) return;
		if(j==0) {
			print2(n,i+1,j);
			System.out.println();
		}
		if(i<n)
			System.out.print("*");
		print2(n,i+1,j+1);
		// 해결은 했지만 구조 이해 필요
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