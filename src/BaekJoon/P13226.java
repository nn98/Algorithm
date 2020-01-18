package BaekJoon;

import java.util.*;
class P13226{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),v=0,c,j,a[]=new int[10000001];
		for(;v<10000001;v++)
			for(c=0;c<10000001/v;a[v*c++]++);
		for(;n-->0;) {
			v=s.nextInt();
			c=s.nextInt();
			j=0;
			for(;v<=c;j=j>a[v]?j:a[v],v++);
			System.out.println(j);
		}
	}

}