package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P12904_2 {

	static String a,b;
	static List<String>l=new ArrayList();
	static boolean F;
	static void o(StringBuffer f) {
		System.out.println("input: "+f);
		if(f.toString().equals(a)) {
			System.out.print(1);
			F=true;
		}
		if(F)return;
		if(f.length()<=a.length())return;
		if(f.charAt(f.length()-1)=='A') {
			f.delete(f.length()-1,f.length());
			System.out.println("f: "+f);
			if(!l.contains(f.toString())) {
				l.add(f.toString());
				o(f);
			}
			o(f);
		}
		else {
			f.delete(f.length()-1,f.length());
			f=f.reverse();
			System.out.println("f: "+f);
			if(!l.contains(f.toString())) {
				l.add(f.toString());
				o(f);
			}
			o(f);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		a=s.next();
		b=s.next();
		o(new StringBuffer(b));
//		System.out.println(l.toString());
		if(!F)System.out.println(0);
	}

}