package BaekJoon;

import java.util.Scanner;

public class PalindromeCal {

	static boolean sol(String[] in) {
		for(int i=0;i<in.length/2;i++) {
			if(in[i].equals(in[in.length-(i+1)])) continue;
			else return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] in=s.next().split("");
		for(int i=0;i<in.length/2;i++) {
			if(in[i].equals(in[in.length-(i+1)])) continue;
			else {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}

}
