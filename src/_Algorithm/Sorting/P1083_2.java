package _Algorithm.Sorting;

import java.io.*;

public class P1083_2 {
	static int n,a[],i,b,c,j,t;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine()),a[]=new int[n],i=0,b,c,j,t;
		for(String s:r.readLine().split(" "))a[i++]=Integer.parseInt(s);
		for(i=Integer.parseInt(r.readLine());i>0;) {
			for(b=0;b<n-2&&i>0;b++) {
				j=0;
				for(c=b;c<n-1&&i>0;c++)
					if(a[c]<a[c+1]) {
						t=a[c];
						a[c]=a[c+1];
						a[c+1]=t;
						j++;
						i--;
					}
				if(j==0)i=0;
			}
		}
		for(int m:a)w.write(m+" ");
		w.flush();
	}

}