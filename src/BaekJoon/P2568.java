package BaekJoon;

import java.io.*;
import java.util.*;
public class P2568 {
	public static void main(String[]z)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int A,N=Integer.parseInt(br.readLine()),o=500001,i=0,a[]=new int[o],b[]=new int[o];
		StringTokenizer st;
		List<Integer>l=new ArrayList();
		for(;i++<N;) {
			st=new StringTokenizer(br.readLine());
			int p=Integer.parseInt(st.nextToken()),q=Integer.parseInt(st.nextToken());
			a[p]=q;
			b[q]=p;
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
					if(A<=ts.last()) {
						l.add(b[ts.ceiling(A)]);
						ts.remove(ts.ceiling(A));
					}
					ts.add(A);
				}
			}
		}
		Collections.sort(l);
		System.out.println(N-ts.size());
		for(int j:l)System.out.println(j);
	}
}