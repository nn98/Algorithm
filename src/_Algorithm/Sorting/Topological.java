package _Algorithm.Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Topological {

	static int n,m,v[],c[],i,j,k,x;
	static List<Integer>[]l;
	static void o() {
		for(i=0;++i<n;)if(c[i]==0)l[0].add(i);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
//		System.out.print("begin from 1? o / x");
//		n=r.readLine().equals("o")?Integer.parseInt(r.readLine())+1:Integer.parseInt(r.readLine());
		n=Integer.parseInt(r.readLine())+1;
		m=Integer.parseInt(r.readLine());
		c=new int[n];
		l=new List[n];
		l[0]=new LinkedList();
		for(;++i<n;l[i]=new ArrayList());
		for(i=0;i++<m;) {
			j=0;
			for(String s:r.readLine().split(" ")) {
				x=Integer.parseInt(s);
				if(j++>0){
					l[k].add(x);
					c[x]++;
				}
				else k=x; 
			}
		}
		System.out.println(Arrays.toString(c));
		for(i=0;++i<n;System.out.println(l[i].toString()));
	}
}