package BaekJoon;

import java.util.Scanner;
public class P6359_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int i=0,k=s.nextInt();i++<k;)
			System.out.println((int)Math.sqrt(s.nextInt()));
	}
}