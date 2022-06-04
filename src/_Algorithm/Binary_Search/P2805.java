package _Algorithm.Binary_Search;

import java.io.*;
public class P2805 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]s=r.readLine().split(" ");
		int n=Integer.parseInt(s[0]),m=Integer.parseInt(s[1]),a[]=new int[n],i=0;
		long M=0,c,N=0,D,d;
		for(String b:r.readLine().split(" ")) {
			a[i]=Integer.parseInt(b);
			M=M>a[i]?M:a[i];
			i++;
		}
		M++;
		for(;N<M;) {
			D=N+(M-N)/2;
			System.out.println(String.format("min: %d max: %d mid: %d",N,M,D));
			c=0;
			for(i=0;i<n;d=a[i++]-D,System.out.println(d),c+=d>0?d:0);;
			System.out.println("c = "+c+" ^ "+m);
			if(c>m)N=D+1;
			else M=D;
		}
		System.out.println(N-1);
	}

}
