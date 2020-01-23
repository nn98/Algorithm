package BaekJoon;

import java.util.*;
public class P10833 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r=0,i;
		for(;n-->0;i=s.nextInt(),r+=s.nextInt()%i);
		System.out.print(r);
	}
}