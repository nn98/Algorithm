package BaekJoon;

import java.util.*;
public class P9085 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,m,r;
		for(;n-->0;) {
			m=s.nextInt();
			r=0;
			for(i=0;i++<m;r+=s.nextInt());
			System.out.println(r);
		}
	}
}