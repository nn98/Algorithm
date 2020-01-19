package BaekJoon;

import java.util.Scanner;

public class P5543 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,m=2000,a;
		for(;i++<2;a=s.nextInt(),n=n<a?n:a);
		for(;i-->1;a=s.nextInt(),m=m<a?m:a);
		System.out.print(n+m-50);
	}

}
