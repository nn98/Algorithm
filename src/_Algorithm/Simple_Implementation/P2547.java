package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P2547 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j=0;
		s.nextLine();
		for(;n>0;) {
			String a=s.nextLine();
			if(a.equals("")) {
				System.out.println(i%j<1?"YES":"NO");
				j=i=0;
				n--;
				continue;
			}
			i+=Integer.parseInt(a);
			j++;
		}
	}

}
