package BaekJoon;

import java.util.Scanner;

public class P1568 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=1,j=0;
		for(;n!=0;j++) {
			if(i>n)i=1;
			n-=i++;
		}
		System.out.print(j);
	}

}
