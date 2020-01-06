package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class P2565 {
	public static void main(String[]z)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int A, N = Integer.parseInt(br.readLine()),a[]=new int[501];
		StringTokenizer st;
		for(;N-->0;) {
			st=new StringTokenizer(br.readLine());
			a[Integer.parseInt(st.nextToken())]=Integer.parseInt(st.nextToken());
		}
		System.out.println(Arrays.toString(a));
		TreeSet<Integer>ts = new TreeSet<>();
		boolean f=false;
		for (int n = 1; n < N; n++){
			if(a[n]!=0) {
				if(!f) {
					ts.add(a[n]);
					f=true;
				}
				else {
					A=a[n];
					if(A<=ts.last())ts.remove(ts.ceiling(A));
					ts.add(A);
				}
			}
		}
		System.out.println(ts.toString());
		System.out.print(ts.size());
	}
}
