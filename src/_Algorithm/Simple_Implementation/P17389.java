package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P17389 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		s.next();
		int r=0,c=0,i=0;
		for(char a:s.next().toCharArray()) {
			i++;
			switch(a) {
			case 'O':
				r+=i+c++;
				break;
			default:
				c=0;
			}
		}
		System.out.println(r);
	}

}
