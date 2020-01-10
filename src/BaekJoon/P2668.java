package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2668 {
	static int n,a[],h[],i=0,r=0;
	static void o(int x,int c,int O) {
		if(c>n)return;
		if(a[x]==O)h[O]=c;
		else o(a[x],c+1,O);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		h=new int[n];
		for(;i<n;a[i++]=s.nextInt()-1);
		for(i=0;i<n;o(i,0,i++));
		System.out.println(Arrays.toString(h));
	}

}
