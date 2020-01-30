package BaekJoon;

import java.util.Scanner;

public class P2981_4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=s.nextInt(),c=i;
		for(;n-->1;) {
			while(i%c==0)c--;
			i=s.nextInt();
		}
		System.out.println(c);
	}
}