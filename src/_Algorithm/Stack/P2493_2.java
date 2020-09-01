package _Algorithm.Stack;

import java.io.*;

public class P2493_2 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine()),a[]=new int[n],i=0,j,k;
		for(String s:r.readLine().split(" "))a[i++]=Integer.parseInt(s);
		for(i=n;i-->0;) {
			k=0;
			for(j=i;j-->0;)
				if(a[i]<=a[j]) {
					a[i]=j+1;
					k=1;
					break;
				}
			if(k==0)a[i]=0;
		}
//		System.out.println(Arrays.toString(b));
		for(int c:a)w.write(c+" ");
		w.flush();
	}

}