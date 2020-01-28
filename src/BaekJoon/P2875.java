package BaekJoon;

import java.util.Scanner;
public class P2875 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),k=s.nextInt(),a=0,b=0,c=0;
		while((n-a)+(m-b)>k) {
			a+=2;
			b++;
			c++;
		}
		System.out.print(c-1);
	}
}