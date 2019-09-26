package BaekJoon;

import java.util.Scanner;

public class P3040_2 {
	
	static int j=6,r[]=new int[7],a[]=new int[9];
//	static StringBuilder sb=new StringBuilder();
	
	//return by || - case confusion
	
	static boolean l(int i,int count,int sum) {
//		System.out.println(i+" "+count+" "+sum);
		if(i>8)return false;
		if(count==7&&sum==100) {
			return true;
		}
		boolean x=l(i+1,count+1,sum+a[i]),y=l(i+1,count,sum);
		if(x) {
//			sb.append(a[i]+"\n");
			r[j--]=a[i];
		}
		if(y) {
			
		}
		return x||y;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<9;i++)a[i]=s.nextInt();
		l(0,0,0);
		for(int i:r)System.out.println(i);
	}
}