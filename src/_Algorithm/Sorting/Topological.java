package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Topological {

	static int n,i,j,x,v[],t[];
	static boolean[][]a;
	static void o() {
		for(i=0;++i<n;) {
			boolean c=false;
			for(j=0;++j<n;c=c|a[i][j]);
			if(!c)t[x++]=i;
		}
	}
	public static void main(String[] args) {
//		System.out.println(1^1); XOR test
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		v=new int[n];
		t=new int[n];
		a=new boolean[n][n];
		for(;++i<n;) {
			v[i]=s.nextInt();
			while((j=s.nextInt())>=0)a[i][j]=true;
		}
		System.out.println(Arrays.toString(v));
		for(boolean[]b:a)
			System.out.println(Arrays.toString(b));
		o();
		System.out.println(Arrays.toString(t));
	}

}
