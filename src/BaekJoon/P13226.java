package BaekJoon;

import java.util.*;
class P13226{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),v=1,c,j,a[]=new int[10000001];
		for(int i=9999900;i<=10000000;i++)
			System.out.println(a[i]);
		for(;n-->0;) {
			v=s.nextInt();
			c=s.nextInt();
			j=0;
			for(;v<=c;j=j>a[v]?j:a[v],v++);
			System.out.println(j);
		}
	}
}