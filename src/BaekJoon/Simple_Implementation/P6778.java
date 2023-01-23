package BaekJoon.Simple_Implementation;

import java.util.Scanner;

public class P6778 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		if(n>2&m<5)System.out.println("TroyMartian");
		if(n<7&m>1)System.out.println("VladSaturnian");
		if(n<3&m<4)System.out.println("GraemeMercurian");
	}

}
