package _Algorithm.Two_Pointer;

import java.io.*;
import java.util.*;

public class P7795 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int i=Integer.parseInt(r.readLine()),j,x,y,a[],b[],R;
		for(;i-->0;) {
			R=0;
			StringTokenizer t=new StringTokenizer(r.readLine());
			a=new int[x=Integer.parseInt(t.nextToken())];
			b=new int[y=Integer.parseInt(t.nextToken())];
			t=new StringTokenizer(r.readLine());
			for(j=0;j<x;a[j++]=Integer.parseInt(t.nextToken()));
			t=new StringTokenizer(r.readLine());
			for(j=0;j++<y;) {
				for(int c:a)R+=c>Integer.parseInt(t.nextToken())?1:0;
			}
			System.out.println(R);
		}
		
	}

}
