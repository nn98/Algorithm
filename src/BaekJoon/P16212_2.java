package BaekJoon;

import java.util.Scanner;
public class P16212_2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt(),j=4000001,p=2000000,a[]=new int[j],b;
		for(;i-->0;a[s.nextInt()+p]++);
		for(i=-1;++i<j;)
			while(a[i]-->0)
				System.out.print(i-p+" ");
	}
}