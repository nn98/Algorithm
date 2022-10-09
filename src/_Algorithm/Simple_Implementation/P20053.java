package _Algorithm.Simple_Implementation;

import java.io.*;
import java.util.*;
public class P20053 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine()),i=0,j;
		for(;n-->0;) {
			j=Integer.parseInt(r.readLine());
			String[]a=r.readLine().split(" ");
			Arrays.sort(a);
			w.write(a[0]+" "+a[a.length-1]+"\n");
		}
		w.flush();
	}

}
