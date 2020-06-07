package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12846_3 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),a[]=new int[n],i=0;
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
	}

}
