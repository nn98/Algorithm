package _Algorithm.Sorting;

import java.io.*;
import java.util.*;

public class P7578_3 {
	public static void main(String[] args)throws Exception{
		BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(R.readLine()),a[]=new int[n],b[],z,A[]=new int[1000001],i=0,j,r=0;
		StringTokenizer t=new StringTokenizer(R.readLine());
		for(;i<n;a[i]=Integer.parseInt(t.nextToken()),A[a[i]]=i++);
		t=new StringTokenizer(R.readLine());
		for(i=0;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		for(i=0;++i<n;) {
			z=A[a[i]];
			for(j=0;j<i;j++)
				if(A[a[j]]>z)r++;
		}
		System.out.print(r);
	}

}