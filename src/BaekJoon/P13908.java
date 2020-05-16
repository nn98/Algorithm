package BaekJoon;

import java.util.Scanner;

public class P13908 {

	static int n,m,r;
	static boolean[]a;
	static void o(String s,int l) {
		System.out.println(s);
		if(s.length()==n) {
			boolean c=true;
			for(int i=0;i++<9&&c;c=a[i]?s.contains(""+i):c);
			r+=c?1:0;
			return;
		}
		for(int i=0;i<10;o(s+i++,l+1));
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new boolean[10];
		for(m=s.nextInt();m-->0;a[s.nextInt()]=true);
		o("",0);
		System.out.println(r);
	}

}
