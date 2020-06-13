package _Algorithm.Brute_Force;

import java.util.Scanner;

public class P2503_2 {
	static int n,m,i,j,d[][];
	static char[]a=new char[3],b[];
	static boolean[]c=new boolean[10];
	static void o(int x) {
		if(x==3) {
			System.out.println(a);
		}
		else for(int k=0;++k<10;)
			if(!c[k]) {
				a[x]=(char)(k+'0');
				c[k]=true;
				o(x+1);
				c[k]=false;
			}
	}
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		o(0);
		m=n=s.nextInt();
		b=new char[n][];
		d=new int[n][2];
		for(;m-->0;b[m]=s.next().toCharArray(),d[m][0]=s.nextInt(),d[m][0]=s.nextInt());
		for(;m<n;System.out.println(b[m]+" "+d[m][0]+" "+d[m][1]));
	}
}