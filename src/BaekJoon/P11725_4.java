package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class P11725_4 {

	static int N, config[];
	static boolean[] c;
	static ArrayList<Integer>[] arr;
	
	static void sol(int c,int p) {
		config[c]=p;
		for(int i:arr[c]) if(i!=p) sol(i,c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		config=new int[N];
		c=new boolean[N];
		arr=new ArrayList[N];
		for(int i=0;i<N;i++) arr[i]=new ArrayList<>();
		for(int i=1;i<N;i++) {
			int a=s.nextInt()-1,b=s.nextInt()-1;
			arr[a].add(b);
			arr[b].add(a);
		}
		sol(0,0);
		for(int i=1;i<N;i++) System.out.println(config[i]+1);
	}
}
