package BaekJoon;

import java.util.HashMap;
import java.util.Scanner;

public class P1302 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		HashMap<String,Integer>t=new HashMap();
		for(;n-->0;) {
			String a=s.next();
			if(t.get(a)==null)t.put(a,1);
			else t.put(a,t.get(a));
			System.out.println(t);
		}
	}

}
