package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P12904 {

	static String a,b;
	static List<StringBuffer>l=new ArrayList();
	static boolean F;
	static void o(StringBuffer f) {
		if(f.toString().equals(b)) {
			System.out.print(1);
			F=true;
		}
		if(F)return;
		if(b.length()<f.length())return;
		StringBuffer c=f.reverse();
		f.append("A");
		c.append("B");
		if(!l.contains(f)) {
			l.add(f);
			o(f);
		}
		if(!l.contains(c)) {
			l.add(c);
			o(c);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		a=s.next();
		b=s.next();
		o(new StringBuffer(a));
		if(!F)System.out.println(0);
	}

}
