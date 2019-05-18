package BaekJoon;

import java.util.Scanner;

public class P17072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt();
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				long rgb=(s.nextLong()*2126)+(s.nextLong()*7152)+(s.nextLong()*722);
				//System.out.print(rgb);
				if(rgb<510000) System.out.print("#");
				else if(rgb<1020000) System.out.print("o");
				else if(rgb<1530000) System.out.print("+");
				else if(rgb<2040000) System.out.print("-");
				else if(rgb>=2040000) System.out.print(".");
			}
			System.out.println();
		}
	}
}