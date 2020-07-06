package BaekJoon;

import java.io.*;
import java.util.*;
import java.math.*;

public class P7453 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),x=0,i;
		BigInteger a;
		while(n-->0) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			a=new BigInteger(t.nextToken());
			for(i=0;i++<3;a=a.add(new BigInteger(t.nextToken())));
			System.out.println(a);
			x+=a.equals(BigInteger.ZERO)?1:0;
		}
		System.out.print(x);
	}

}
