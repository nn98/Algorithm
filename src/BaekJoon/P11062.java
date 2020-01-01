package BaekJoon;

import java.util.Scanner;

public class P11062 {
	//1. 단순 선택. 현재에서 최선만.
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,a[];
		for(;n-->0;) {
			m=s.nextInt();
			a=new int[m];
			for(int i=0;i<m;a[i++]=s.nextInt());
			int f=0,t=m-1,x=0,y=0;
			for(int i=0;i<m;i++) {
				int v=0;
				if(a[f]>a[t])v=a[f++];
				else v=a[t--];
				if(i%2==0)
					x+=v;
				else y+=v;
			}
			System.out.print(x+" "+y);
		}
	}

}
