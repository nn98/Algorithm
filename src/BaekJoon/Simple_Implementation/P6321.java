package BaekJoon.Simple_Implementation;

import java.util.Scanner;

public class P6321 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		for(;n-->0;) {
			System.out.print((i>0?"\n":"")+"String #"+ ++i+"\n");
			for(char c:s.next().toCharArray())System.out.print((char)(c>89?'A':c+1));
			System.out.println();
		}
	}

}