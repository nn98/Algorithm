package _Algorithm.Sorting;

import java.io.*;
import java.util.*;

public class P1377_6 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),j=1000001,i=0,R,c=0,k;
		List<Integer>[]a=new List[1000001];
		for(;i++<n;) {
			R=Integer.parseInt(r.readLine());
			if(a[R]==null)a[R]=new ArrayList();
			a[R].add(i);
		}
		R=0;
		for(i=0;i<j;i++) {
			if(a[i]!=null) {
				Collections.sort(a[i]);
				for(k=0;k<a[i].size();k++) {
					c++;
					R=Math.min(a[i].get(k)-c,R);
				}
			}
		}
		System.out.println(R+1);
	}

}
