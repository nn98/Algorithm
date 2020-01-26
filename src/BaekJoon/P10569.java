package BaekJoon;

import java.util.Scanner;
public class P10569 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(;n-->0;System.out.println((s.nextInt()-s.nextInt()-2)*-1));
	}
}