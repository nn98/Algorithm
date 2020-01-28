package BaekJoon;

import java.util.Scanner;
public class P2875 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),k=s.nextInt(),a=0,b=0,c=-1;
		while((n-a)+(m-b)>=k) {
			a+=2;
			b++;
			c++;
		}
		if(c*2>n)c=n/2;
		if(c>m)c=m;
		System.out.print(c);
	}
}