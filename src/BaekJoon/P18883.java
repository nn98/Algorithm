package BaekJoon;

import java.util.Scanner;

public class P18883 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0;
		for(;i<=n*m;System.out.print(i++%m==0?i+"\n":i+" "));
	}

}
