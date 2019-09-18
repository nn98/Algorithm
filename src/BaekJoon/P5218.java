package BaekJoon;

import java.util.Scanner;

public class P5218 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			String a=s.next(),b=s.next();
			System.out.print("Distances: ");
			for(int j=0;j<a.length();j++) {
				int d=a.charAt(j)<=b.charAt(j)?b.charAt(j)-a.charAt(j):(b.charAt(j)+26)-a.charAt(j);
				System.out.print(d+" ");
			}
			System.out.println();
		}
	}
}