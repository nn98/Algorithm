package insert;

import java.math.BigInteger;
import java.util.Scanner;

public class P2010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r=1;
//		s.nextLine();
//		BigInteger bi=new BigInteger("1");
		for(int i=0;i<n;i++) {
			r+=s.nextInt()-1;
//			bi=bi.multiply(new BigInteger(s.nextLine()));
		}
//		System.out.println(bi);
		System.out.println(r);
	}

}
