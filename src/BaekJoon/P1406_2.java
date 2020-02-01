package BaekJoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P1406_2 {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		String t;
		List<String>l=Arrays.asList(s.next().split(""));
		int n=s.nextInt(),i=l.size();
		for(;n-->0;) {
			switch(t=s.next()) {
			case "L":
				if(i>0)i--;
				break;
			case "D":
				if(i<l.size())i++;
				break;
			case "B":
				l.remove(i-1);
				break;
			case "P":
				l.add(i,s.next());
				break;
			}
		}
		for(String j:l)System.out.print(j);
	}
}
