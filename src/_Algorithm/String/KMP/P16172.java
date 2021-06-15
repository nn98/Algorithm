package _Algorithm.String.KMP;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P16172 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next();
		a=a.replaceAll("[0-9]","");
		System.out.println(a);
	}

}
