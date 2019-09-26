package BaekJoon;

import java.math.*;
import java.util.*;
class P2935_S{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.nextLine()),b;
		String t=s.nextLine();
		b=new BigInteger(s.nextLine());
		if(t.equals("+")) a=a.add(b);
		else a=a.multiply(b);
        System.out.print(a);
	}
}