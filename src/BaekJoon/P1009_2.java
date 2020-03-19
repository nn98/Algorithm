package BaekJoon;

import java.util.Scanner;
public class P1009_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int a=s.nextInt(),b=s.nextInt(),c=a;
			for(int j=1;j<b;j++) {
//				System.out.println("a: "+a);
				a=(a*c);
				a%=10;
			}
			if(a==0) System.out.println(10);
			else System.out.println(a);
		}
	}
}
// 1
// 2 4 8 6 2
// 3 9 7 1 3
// 4 6 4
// 5
// 6
// 7 9 3 1 7
// 8 4 2 6 8
// 9 1