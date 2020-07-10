package _Algorithm.DP;

import java.io.*;
import java.util.*;

public class P11066_2 {

	static int[] sum,dp,f;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),m,i,a;
		while(n-->0) {
			m=Integer.parseInt(r.readLine());
			f=new int[m];
			StringTokenizer t=new StringTokenizer(r.readLine());
			for(i=0;i<m;f[i++]=Integer.parseInt(t.nextToken()));
		}
		System.out.println(a);
	}
}

}