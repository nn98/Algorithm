package BaekJoon;

import java.util.Scanner;

public class P2711 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i;
		for(;n-->0;) {
			i=s.nextInt();
			StringBuffer t=new StringBuffer(s.next());
			System.out.println(t.deleteCharAt(i-1));
		}
	}
}