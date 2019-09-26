package BaekJoon;

import java.util.Scanner;

public class P3040 {
	static int[]a=new int[10];
	static void sol(int i,String s){
		if(i>8) return;
		if(!s.equals("")){
			String[]b=s.split("");
			int c=0;
			for(String j:b)c+=a[Integer.parseInt(j)];
			if(c==100&&b.length==7) for(String j:b) System.out.println(a[Integer.parseInt(j)]);
		}
		sol(i+1,s+i);
		sol(i+1,s);
	}
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		for(int i=0;i<9;i++)a[i]=s.nextInt();
		sol(0,"");
	}
}