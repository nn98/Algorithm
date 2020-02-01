package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11004_2 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		int n=Integer.parseInt(t.nextToken()),m=Integer.parseInt(t.nextToken()),a[]=new int[n];
		t=new StringTokenizer(r.readLine());
		for(;n-->0;a[n]=Integer.parseInt(t.nextToken()));
		Arrays.sort(a);
		System.out.print(a[m-1]);
	}
}