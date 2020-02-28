package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1564_6 {
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long n=Long.parseLong(br.readLine()),m=1,r=1,d=1000000000000L;
		while(m++<n) {
			r*=m;
			while(r%10==0)r/=10;
//			? ¾Æ´Ï ½¬¹ú?
			r%=d;
		}
		String R=""+r;
		System.out.println(R.substring(R.length()-5,R.length()));
	}
}