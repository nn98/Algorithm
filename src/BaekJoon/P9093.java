package BaekJoon;

import java.util.Scanner;

public class P9093 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j;
		s.nextLine();
		for(;i<n;i++) {
			String[]a=s.nextLine().split(" ");
			for(String b:a)
				for(j=b.length()-1;j>=0;j--)
					System.out.print(b.charAt(j)+(j==0?" ":""));
		}
	}
}