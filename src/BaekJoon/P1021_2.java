package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1021_2 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		int n=Integer.parseInt(t.nextToken()),m=Integer.parseInt(t.nextToken()),N=0,a[]=new int[n];
		t=new StringTokenizer(r.readLine());
		for(;n-->0;a[Integer.parseInt(t.nextToken())]++);
		System.out.println(Arrays.toString(a));
	}

}
