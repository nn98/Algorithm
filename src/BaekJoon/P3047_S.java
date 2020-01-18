package BaekJoon;

import java.util.*;
public class P3047_S {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0,a[]=new int[3];
		for(;i<3;a[i++]=s.nextInt());
		Arrays.sort(a);
		String t=s.next();
		for(i=0;i<3;System.out.print(a[t.charAt(i++)-65]+" "));
	}
}