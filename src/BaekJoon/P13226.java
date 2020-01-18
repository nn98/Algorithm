package BaekJoon;

import java.util.*;
class P13226{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),v=1,c,j,a[]=new int[10000001];
		for (int i = 1; i <= 10000000; i++) { 
			for (j = 1; j <= 10000000 / i; j++) { 
				a[i * j]++; 
				}
			}

		//		for(;v<10000001;v++)
		//			for(c=1;c<10000000/v;a[v*c++]++);
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