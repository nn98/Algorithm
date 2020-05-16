package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P12904 {

	static String a,b;
	static List<String>l=new ArrayList();
	static boolean F;
	static void o(StringBuffer f) {
		System.out.println("input: "+f);
		if(f.toString().equals(b)) {
			System.out.print(1);
			F=true;
		}
		if(F)return;
		if(b.length()==f.length())return;
		StringBuffer c=new StringBuffer(f).reverse();
		f.append("A");
		c.append("B");
		System.out.println("f: "+f);
		System.out.println("c: "+c);
		if(!l.contains(f.toString())) {
			l.add(f.toString());
			o(f);
		}
		if(!l.contains(c.toString())) {
			l.add(c.toString());
			o(c);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		a=s.next();
		b=s.next();
		o(new StringBuffer(a));
		System.out.println(l.toString());
		if(!F)System.out.println(0);
	}

}
