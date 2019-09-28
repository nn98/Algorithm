package BaekJoon;

import java.util.Scanner;

public class P1712 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//== ¾Æ´Ï¶ó <=;
		int a=s.nextInt(),b=-s.nextInt()+s.nextInt(),r=b==0?-1:a/b+1;
		System.out.print(r);
	}
}