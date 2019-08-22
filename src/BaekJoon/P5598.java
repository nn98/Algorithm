package BaekJoon;

import java.util.Scanner;

public class P5598 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char[] arr=s.next().toCharArray();
		for(char i:arr) {
			if(i<'D') System.out.print((char)(i+26-3));
			else System.out.print((char)(i-3));
		}
	}
}
