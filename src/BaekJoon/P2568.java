package BaekJoon;

import java.io.*;
import java.util.*;
public class P2568 {
	public static void main(String[]z)throws Exception{
		ArrayList<Integer>r=new ArrayList<Integer>(50000);
		System.out.println(r.size());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int A,N=Integer.parseInt(br.readLine()),o=501,i=0,a[]=new int[o],x;
		StringTokenizer st;
		StringBuffer F=new StringBuffer();
		for(;i++<N;) {
			st=new StringTokenizer(br.readLine());
			int p=Integer.parseInt(st.nextToken()),q=Integer.parseInt(st.nextToken());
			a[p]=q;
			r.add(p,q);
		}
		TreeSet<Integer>ts = new TreeSet<>();
		boolean f=false;
		for (i=0;++i<o;){
			if(a[i]!=0) {
				if(!f) {
					ts.add(a[i]);
					x=i;
					f=true;
				}
				else {
					A=a[i];
					if(A<=ts.last()) {
						F.append(ts.ceiling(A)+" ");
						ts.remove(ts.ceiling(A));
					}
					ts.add(A);
					
				}
			}
		}
//		System.out.println(F);
//		System.out.println(ts.toString());
		st=new StringTokenizer(F.toString());
		F=new StringBuffer();
		F.append(r.indexOf(Integer.parseInt(st.nextToken()))+" ");
		System.out.println(F);
		System.out.print(N-ts.size());
	}
}