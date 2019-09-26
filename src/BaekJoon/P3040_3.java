package BaekJoon;

import java.util.Scanner;

public class P3040_3 {
	static int[]a=new int[9];
	static void sol(int i,int s,int c,String his){
//		System.out.println(s+" "+c);
		if(i==9) 
			return;
		if(s==100&&c==7) System.out.println(his);
		sol(i+1,s+a[i],c+1,his+a[i]+"\n");
		sol(i+1,s,c,his);
	}
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		for(int i=0;i<9;i++)a[i]=s.nextInt();
		sol(0,0,0,"");
	}
}