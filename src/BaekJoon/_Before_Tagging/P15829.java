package BaekJoon._Before_Tagging;

import java.math.BigInteger;
import java.util.Scanner;

public class P15829 {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 long n=s.nextInt(),i=0,m=31;
		 char[]a=s.next().toCharArray();
		 BigInteger r=new BigInteger("0");
		 for(;i<n;i++) {
			 r=r.add(new BigInteger(""+(a[(int)i]-96)*(long)Math.pow(m,i)));
		 }
		 System.out.println(r.mod(new BigInteger("1234567891")));
	}
}