package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class P15829 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt(),i=0,m=31;
		 char[]a=s.next().toCharArray();
		 BigInteger r=new BigInteger("0");
		 for(;i<n;i++) {
			 r.add(new BigInteger(""+(a[i]-96)*Math.pow(m,i)));
		 }
		 System.out.println(r);
	}

}
