package BaekJoon;

import java.util.Scanner;

public class P11179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=1;
		while(n>=k) k*=2;
		k/=2;
		String as="";
		for(;;k/=2) {
			if(n==0) as+=0;
			else {
				as+=n/k;
				n%=k;
			}
			if(k==1) break;
		}
		StringBuilder sb=new StringBuilder(as);
		sb.reverse();
		as=sb.toString();
		k=0;
		while(as.charAt(k)=='0') k++;
		as=as.substring(k, as.length());
//		System.out.println(as);
		k=1;
		int r=0;
		for(int i=as.length()-1;i>=0;i--) {
			if(as.charAt(i)=='1') r+=k;
			k*=2;
		}
		System.out.println(r);
//		for(int i=0;sb.charAt(i)=='0';i++) sb.setCharAt(i, (char) 0);
		
//		as.replaceAll(" ", "");
	}
}
