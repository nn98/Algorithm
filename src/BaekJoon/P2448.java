package BaekJoon;
/*
for(int j=0;j<=i/3;j++) {
	if(i%3==0) {
		for(int a=0;a<i/3;a++)
			System.out.print("****** ");
	} else if(i%3==2) {
		for(int a=0;a<=i/3;a++) {
			System.out.print("* *");
		}

	} else {
		for(int a=0;a<=i/3;a++) {
			System.out.print("*");
			for(int b=0;b<(i/3)*5+(i/3);b++)
				System.out.print(" ");
		}
	}
}
for(int i=1;i<=N;i++) {
			for(int j=N-i;j>0;j--) {

			}
			star(i);
			System.out.println();
		}
 */
import java.util.Scanner;

public class P2448 {
	static Scanner s=new Scanner(System.in);
	static int N;
	static void star(int i) {
		for(int j=N-i;j>1;j--) System.out.print(" ");
		for(int j=i/3;j>=0;j--) {
			if(i%3==0) {
				System.out.print("*");
				for(int k=i*2-i/3;k>0;k--) System.out.print(" ");
			}
			if(i%3==1) {
				System.out.print("* *");
				for(int k=(int) Math.pow(3, i/3);k>0;k--) System.out.print(" ");
			}
			if(i%3==2) {
				if(i/3%3==2) System.out.print("     ");
				else System.out.print("*****");
				for(int k=i/3;k>0;k--) System.out.print(" ");
			}

		}
		System.out.println();
	}
	static void sol(int i) {
		System.out.println(i);
		if(i>3) {
			for(int j=0;j<=i/3;j++)
				sol(i-3);
		}
		else {
			for(int j=0;j<i;j++) {
				for(int k=N-j;k>1;k--) System.out.print(" ");
				if(j==0) {
					System.out.print("*");
					//for(int k=i*2-i/3;k>0;k--) System.out.print(" ");
				}
				if(j==1) {
					System.out.print("* *");
					//for(int k=(int) Math.pow(3, i/3);k>0;k--) System.out.print(" ");
				}
				if(j==2) {
					//if(i/3%3==2) System.out.print("     ");
					System.out.print("*****");
					//for(int k=i/3;k>0;k--) System.out.print(" ");
				}

				System.out.println();
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N=s.nextInt();
		for(int i=0;i<N;i++) star(i);
		sol(N);
	}

}
