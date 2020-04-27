package BaekJoon;

import java.util.Scanner;

public class P18883 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=1;
		for(;i<=n*m;System.out.println(i%m==0?"\n":i+++" "));
	}

}
