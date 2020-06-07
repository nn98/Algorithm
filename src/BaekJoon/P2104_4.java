package BaekJoon;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class P2104_4 {

	static int n,a[],i,j;
	static long R;
	static void o(int f,int t) {
//		System.out.println(f+" "+t);
		if(t<f)return;
		if(f==t)R=R>a[f]?R:a[f];
		else {
			int m=a[f],l=t-f+1,i=f,j=f;
			long v=m;
			for(;i++<t;) {
				v+=a[i];
				if(a[i]<m) {
					j=i;
					m=a[i];
				}
			}
			v*=m;
			R=R>v?R:v;
				o(f,j-1);
				o(j+1,t);
		}

	}
	public static void main(String[] args)throws Exception{
		BigInteger b=new BigInteger("1000000"),c=new BigInteger("500000500000");
		System.out.println(b.multiply(c));
		System.out.println("9223372036854775807");
//		for(;i++<1000;System.out.print(" "+1000000));
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
//		System.out.println(Arrays.toString(a));
		o(0,n-1);
		System.out.println(R);
	}

}
