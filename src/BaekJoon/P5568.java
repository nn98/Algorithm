package BaekJoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class P5568 {
	static String[]a;
	static int n,i,m;
	static HashSet<String> r=new HashSet();
	static void o(int x,int c,String t) {
		if(c==i) {
			r.add(t);
			return;
		}
		if(x==m)return;
		o(x+1,c,t);
		o(x+1,c+1,t+a[x]);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		a=new String[m=n=s.nextInt()];
		for(i=s.nextInt();n>0;a[--n]=s.next());
		System.out.println(Arrays.toString(a));
		o(0,0,"");
		System.out.println(r.toString());
	}
}