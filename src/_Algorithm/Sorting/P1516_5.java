package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P1516_5 {

	static int n,m,i,j,t[],a[][];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		t=new int[n];
		a=new int[n][n];
		for(;++i<n;m=0)
			while(m!=-1)
				if(m==0)t[i]=m=s.nextInt();
				else a[i][s.nextInt()]++;
		System.out.println(Arrays.toString(t));
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
