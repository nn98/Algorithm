package BaekJoon;

import java.util.Scanner;

public class P10988 {
	//3min
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
