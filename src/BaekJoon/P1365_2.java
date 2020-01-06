package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1365_2 {
	static int n,a[],h[],i=0,r;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(f.readLine());
		a=new int[n];
		h=new int[n];
		StringTokenizer t=new StringTokenizer(f.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		for(i=0;i<n;i++) {
			for(int j=i;j>=0;j--) {
				if(h[j]!=0) {
					h[i]=h[j]+1;
					r=r>h[i]?r:h[i];
					break;
				}
			}
		}
		System.out.println(Arrays.toString(h));
		System.out.print(n-r-1);
	}
}
