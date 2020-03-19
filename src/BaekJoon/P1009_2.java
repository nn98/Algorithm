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