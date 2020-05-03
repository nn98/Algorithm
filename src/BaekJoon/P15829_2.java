package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P15829_2 {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt(),i=0;
		 char[]a=s.next().toCharArray();
		 BigInteger r=new BigInteger("0"),p,q=new BigInteger("31");
		 for(;i<n;i++) {
			 p=new BigInteger(""+(a[i]-96));
			 p=p.multiply(q.pow(i));
		 }
		 System.out.println(r.mod(new BigInteger("1234567891")));
	}
}