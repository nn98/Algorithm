package BaekJoon;

import java.util.Scanner;

public class P17293_U {

	public static void main(String[] args) {
		int m=new Scanner(System.in).nextInt(),n=m+1;
		String o="%s bottle%s of beer on the wall, %s bottle%s of beer.\n",
				d="Take one down and pass it around, %s bottle%s of beer on the wall.\n\n",
				l="Go to the store and buy some more, %d bottle%s of beer on the wall.",
				p="o more";
		while(n>0) {
			n--;
			if(n==2) System.out.printf(o+d,n,"s",n,"s",n-1,"");
			else if(n==1) System.out.printf(o+d,n,"",n,"","n"+p,"s");
			else if(n==0)System.out.printf(o+l,"N"+p,"s","n"+p,"s",m,m==1?"":"s");
			else System.out.printf(o+d,n,"s",n,"s",n-1,"s");
		}
	}
}