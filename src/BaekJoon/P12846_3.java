package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12846_3 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),a[]=new int[n],i=0,j,m,v=0,e;
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		for(i=0;i<n;i++) {
			m=1000000;
			e=0;
			for(j=i;j<n;j++) {
				m=m<a[j]?m:a[j];
				e=Math.max(e,m*(j-i+1));
				v=v>e?v:e;
			}
		}
		System.out.print(v);
	}
}