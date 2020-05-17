package BaekJoon;

import java.util.Scanner;
public class P13908_2 {
	static int n,m,M,r;
	static boolean[]a;
	static void o(int s,int l) {
		if(s==n) {
			r+=l==M?1:0;
			return;
		}
		for(int i=-1;i++<9;) {
			if(a[i]) {
				a[i]=!a[i];
				o(s+1,l+1);
				a[i]=true;
			}
			else o(s+1,l);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new boolean[10];
		for(M=m=s.nextInt();m-->0;a[s.nextInt()]=true);
		o(0,0);
		System.out.println(r);
	}
}