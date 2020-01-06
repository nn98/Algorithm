package BaekJoon;

import java.io.*;
import java.util.*;
public class P2568 {
	public static void main(String[]z)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int A,N=Integer.parseInt(br.readLine()),o=501,i=0,a[]=new int[o];
		StringTokenizer st;
		for(;i++<N;) {
			st=new StringTokenizer(br.readLine());
			a[Integer.parseInt(st.nextToken())]=Integer.parseInt(st.nextToken());
		}
		TreeSet<Integer>ts = new TreeSet<>();
		boolean f=false;
		for (i=0;++i<o;){
			if(a[i]!=0) {
				if(!f) {
					ts.add(a[i]);
					f=true;
				}
				else {
					A=a[i];
					if(A<=ts.last())ts.remove(ts.ceiling(A));
					ts.add(A);
				}
			}
		}
		System.out.print(N-ts.size());
	}
}