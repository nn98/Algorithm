package BaekJoon;

import java.util.Scanner;

public class P1264 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String in;
		int i=0,r=0,a[],j;
		while(!"#".equals(in=s.nextLine())) {
			a=new int[26];
			for(i=0;i<in.length();j=in.charAt(i++),j=j<97?j+=32:j,j-='a',a[j<26&&j>=0?j:1]++);
			System.out.println(a[0]+a[4]+a[8]+a[14]+a[20]);
		}
		
	}
}