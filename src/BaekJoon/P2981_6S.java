package BaekJoon;
//?????

import java.util.Arrays;
import java.util.Scanner;

public class P2981_6S {
	static int G(int a,int b) {
		if(b==0)return a;
		else return G(b,a%b);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,m;
		for(;i<n;a[i++]=s.nextInt());
		Arrays.sort(a);
		m=a[1]-a[0];
		for(i=2;i<n;m=G(m,a[i]-a[i++-1]));
		for(i=2;i<=m;System.out.print(m%i==0?i+" ":""));
	}
}