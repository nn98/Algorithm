package BaekJoon;

import java.util.Scanner;

public class P5355 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt(),j;
		s.nextLine();
		for(;i-->0;) {
			String[]a=s.nextLine().split(" ");
			double r=Double.parseDouble(a[0]);
			for(j=0;++j<a.length;) {
				switch(a[j]) {
				case "@":
					r*=3;
					break;
				case "#":
					r-=7;
					break;
				case "%":
					r+=5;
					break;
				}
			}
			System.out.printf("%.2f\n",r);
		}
	}

}
