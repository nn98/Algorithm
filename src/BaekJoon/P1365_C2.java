package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1365_C2 {

	//시발 시간제한 1초->2초
	static int n,a[],h[],i=0,m=0;
	static int o(int x) {
		int r=h[x];
		if(r>0)return r;
		r=1;
		for(int i=x+1;i<n;i++)if(a[i]>a[x])r=Math.max(r,o(i)+1);
		m=m>r?m:r;
		return h[x]=r;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(f.readLine());
		StringTokenizer t=new StringTokenizer(f.readLine());
		a=new int[n];
		h=new int[n];
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		for(i=0;i<n;o(i++));
		System.out.print(n-m);
	}
}