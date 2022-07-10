package _Algorithm.Two_Pointer;

import java.io.*;
import java.util.*;

public class P2832 {
	static int n,a[],i,j,k,p;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		StringTokenizer t=new StringTokenizer(r.readLine());
		a=new int[n];
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		for(;++k<n-1;) {
			if(a[k-1]<a[k]) {
				for(i=k-1;i>=j;p=a[i],a[i]=a[j],a[j]=p,i--,j++);
				j=k;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
