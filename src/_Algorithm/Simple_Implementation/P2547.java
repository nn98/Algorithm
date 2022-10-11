package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P2547 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,j;
		s.nextLine();
		for(;n>0;) {
			String a=s.nextLine();
			if(a.equals(""))n--;
			j=i=0;
			i+=Integer.parseInt(a);
			j++;
		}
	}

}
