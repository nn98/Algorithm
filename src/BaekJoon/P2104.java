package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2104 {

	static int n,a[],i,R,V[][],j,k;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		V=new int[n][n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;i++) {
			V[i][i]=a[i]=Integer.parseInt(t.nextToken());
			if(i==0)continue;
			for(j=i;j>=0;V[j][i]=V[j--][i-1]+a[i]);
		}
		System.out.println(Arrays.toString(a)+"\n");
		for(int[]b:V)System.out.println(Arrays.toString(b));
	}

}
