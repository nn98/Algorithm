package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class P1365_C {

	static List<Integer> a=new ArrayList();
	static int o(int n) {
		int l=0,h=a.size()-1;
		while(l<h) {
			int m=(l+h)/2;
			if(a.get(m)>=n)
				h=m;
			else
				l=m+1;
		}
		return h;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n,i=0;
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(f.readLine());
		StringTokenizer t=new StringTokenizer(f.readLine());
		for(;i<n;i++) {
			int v=Integer.parseInt(t.nextToken());
			if(v>a.get(a.size()-1)) {
				a.add(v);
			}
			else a
		}
		System.out.println(Arrays.toString(a));
		System.out.print(n-s+1);
	}

}
