package _Algorithm.Simple_Implementation;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class P1837 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BigInteger a=new BigInteger(s.next());
		int i=s.nextInt(),b[]=new int[i+1],j=2,k;
		for(;j<=i;j++)if(b[j]<1)for(k=j*2;k<=i;b[k]++,k+=j);
		System.out.println(Arrays.toString(b));
		for(j=2;j<=i;j++)if(b[j]<1)if(a.mod(new BigInteger(j+"")).equals(BigInteger.ZERO)) {
			System.out.println("BAD "+j);
			return;
		}
		System.out.println("GOOD");
	}

}
