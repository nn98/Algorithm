package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1915_2 {
	//index 0 제외해서? charArray라서?
	public static void main(String[]z) throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String[]a=r.readLine().split(" ");
		int n=Integer.parseInt(a[0]),m=Integer.parseInt(a[1]),i=0,j=0,
				b[][]=new int[n][m],p=0;
		if(n==1&&m==1) {
			if(r.readLine().equals("1"))
				p=1;
			else
				p=0;
			System.out.print(p);
			return;
		}
		for(;i<n;i++) {
			j=0;
			for(char c:r.readLine().toCharArray())b[i][j++]=c-'0';
		}
		for(i=1;i<n;i++) {
			for(j=1;j<m;j++) {
				if(b[i][j]==1) {
					b[i][j]=Math.min(b[i-1][j],Math.min(b[i][j-1],b[i-1][j-1]))+1;
					p=p>b[i][j]?p:b[i][j];
				}
			}
		}
//		for(i=0;i<n;i++)System.out.println(Arrays.toString(b[i]));
		System.out.println(p*p);
	}
}