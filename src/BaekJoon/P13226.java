package BaekJoon;

import java.util.*;
//테스트는 끝까지
//https://mygumi.tistory.com/122
class P13226{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),v=1,c,j=10000000,a[]=new int[j+1];
		for(;v<=j;v++)
			for(c=1;c<=j/v;a[v*c]++,c++);
		for(;n-->0;) {
			v=s.nextInt();
			c=s.nextInt();
			j=0;
			for(;v<=c;j=j>a[v]?j:a[v],v++);
			System.out.println(j);
		}
	}
}