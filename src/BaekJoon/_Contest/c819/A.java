package BaekJoon._Contest.c819;

import java.io.*;

public class A {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]a=r.readLine().split(" ");
		double n=Integer.parseInt(a[0]),m=Integer.parseInt(a[1]),c=n-n*m*.01;
		System.out.println(c<100?1:0);
	}

}
