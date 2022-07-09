package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P17388 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,n=s.nextInt(),m=0,j=0,u=0;
		for(;++i<3;u+=m)if((m=s.nextInt())<n) {
			j=i;
			n=m;
		}
		System.out.println(u>99?"OK":(j<1?"Soongsil":(j<2?"Korea":"Hanyang")));
	}
}
