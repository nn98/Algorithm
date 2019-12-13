package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1806_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]N=r.readLine().split(" ");
		int n=Integer.parseInt(N[0]),m=Integer.parseInt(N[1]),i=0,a[]=new int[n],f=0,t=0,o=Integer.MAX_VALUE,v=0;
		N=r.readLine().split(" ");
		for(;i<n;i++)a[i]=Integer.parseInt(N[i]);
		for(;t<n;) {
			v+=a[t];
			if(v>=m) {
				while(v>=m)v-=a[f++];
				v+=a[--f];
			}
			if(v>=m)o=o<t-f+1?o:t-f+1;
			t++;
		}
		System.out.print(o==Integer.MAX_VALUE?0:o);
	}
}