package BaekJoon;

import java.util.Scanner;

public class P10823 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuffer a=new StringBuffer();
		long r=0;
		while(s.hasNext())	a.append(s.next());
		for(String b:a.toString().split(","))r+=Long.parseLong(b);
		System.out.print(r);
	}

}
