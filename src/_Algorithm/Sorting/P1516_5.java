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
			while(true)
				if(m==0)t[i]=m=s.nextInt();
				else {
					if((m=s.nextInt())!=-1)break;
					a[i][m]++;
				}
		System.out.println(Arrays.toString(t));
		for(int[]b:a)System.out.println(Arrays.toString(b));
	}

}
