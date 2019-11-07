package Merge;

import java.util.Scanner;

public class P2909 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p=s.nextInt(),c=s.nextInt(),d=(int) Math.pow(10,c),
				a=p%d,b=d-a;
		System.out.println(a+" "+b);
		System.out.print(a<b?p-a:p+b);
	}

}
