package BaekJoon;

import java.util.Scanner;

public class P5596 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0,b=0,i=0;
		for(;i++<8;)if(i<5)a+=s.nextInt();else b+=s.nextInt();
		System.out.print(a>b?a:b);
	}

}
