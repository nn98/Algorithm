package ssafy;

import java.io.*;
import java.util.*;

class Solution_1
{
	static int n,m,i,j,x,a[];
	static long u;
	public static void main(String args[]) throws Exception
	{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		for(;n-->0;) {
			m=Integer.parseInt(r.readLine());
			StringTokenizer t=new StringTokenizer(r.readLine());
			a=new int[m];
			for(i=0;i<m;a[i++]=Integer.parseInt(t.nextToken()));
			for(i=0;i<m;i++)for(j=0;j<m;j++)if(i==j)continue;else{
				u+=a[i]%a[j];
			}
			System.out.println(String.format("#%d %d",++x,u));
			u=0;
		}
	}
}