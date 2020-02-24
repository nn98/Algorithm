package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1062 {
	static boolean[]h=new boolean[26];
	static int n,m,l=0;
	static void o(int a,int c) {
		
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		m=Integer.parseInt(t.nextToken());
		if(m>4) {
			if(m==26)l=26;
			else {
				
			}
		}
		System.out.print(l);
	}
}
