package BaekJoon;

import java.util.Scanner;

public class P2822 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=1,j,r=0,c=0,z=151,a[]=new int[9];
		boolean[]b=new boolean[z],p=new boolean[z];
		for(;i<9;b[a[i++]=s.nextInt()]=true);
		for(i=z;--i>0&&c<5;) {
			if(b[i]) {
				for(j=1;j<9;j++)p[j]=i==a[j];
				r+=i;
				c++;
			}
		}
		System.out.println(r);
		for(i=1;i<z;System.out.print(p[i++]?i+" ":""));
	}
}