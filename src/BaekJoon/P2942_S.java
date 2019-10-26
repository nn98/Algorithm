package BaekJoon;

import java.util.Scanner;
public class P2942_S {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),m=a<b?a:b,i=0;
		while(i++<=m)
			if(a%i==0&&b%i==0)
				System.out.println(i+" "+a/i+" "+b/i);
	}
}