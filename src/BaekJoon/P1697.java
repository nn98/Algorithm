package BaekJoon;

import java.util.Scanner;

public class P1697 {

	static int t,min=Integer.MAX_VALUE;
	static boolean f=false;
	static boolean[] his=new boolean[100001];

	static void sol(int v,int c) {
		if(v>t+1) return;
		System.out.println(v+" , "+c);
		if(v<0||v>100000) return;
		if(his[v]) return;
		else his[v]=true;
		if(v==t) {
			if(c<min) min=c;
		}
//		if(!his[v-1])
			sol(v-1,c+1);
//		if(!his[v+1])
			sol(v+1,c+1);
//		if(!his[v*2])
			sol(v*2,c+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		t=s.nextInt();
		sol(f,0);
		System.out.println(min);
	}

}
