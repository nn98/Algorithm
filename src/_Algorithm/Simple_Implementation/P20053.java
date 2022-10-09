package _Algorithm.Simple_Implementation;

import java.io.*;
import java.util.*;
public class P20053 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine()),i=0,j,a[];
		for(;n-->0;) {
			j=Integer.parseInt(r.readLine());
			a=new int[j];
//			String[]a=r.readLine().split(" ");
			StringTokenizer t=new StringTokenizer(r.readLine());
			for(i=0;i<j;a[i++]=Integer.parseInt(t.nextToken()));
			Arrays.sort(a);
			w.write(a[0]+" "+a[a.length-1]+"\n");
		}
		w.flush();
	}

}
