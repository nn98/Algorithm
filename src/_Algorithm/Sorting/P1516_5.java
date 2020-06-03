package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1516_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,m=0,i=0,r[],t[],a[][];
		t=new int[n];
		r=new int[n];
		a=new int[n][n];
		for(;++i<n;m=0)
			while(true)
				if(m==0)t[i]=m=s.nextInt();
				else {
					if((m=s.nextInt())==-1)break;
					a[i][m]++;
					r[i]++;
				}
		System.out.println(Arrays.toString(t));
		System.out.println(Arrays.toString(r));
		for(int[]b:a)System.out.println(Arrays.toString(b));
		Queue<Integer> q=new LinkedList();
		m=n;
		while(m>1) {
			for(i=0;++i<n;)if(r[i]==0)q.add(i);
			
		}
	}

}