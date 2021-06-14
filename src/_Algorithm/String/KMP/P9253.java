package _Algorithm.String.KMP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 야매 실패
public class P9253 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		char[][]a=new char[3][];
		int i=0,j,k=0,b[]=new int[3],c[]=new int[2];
		for(;i<3;a[i]=r.readLine().toCharArray(),b[i]=a[i++].length);
		System.out.println(b[2]);
		for(i=0;i<2;i++,k=0)
			for(j=0;j<b[i]&c[i]<1;j++) {
				if(a[i][j]==a[2][k]) {
					k++;
					if(k==b[2])c[i]++;
				}
				System.out.println(k+" "+c[i]);
			}
		System.out.print(c[0]>0&c[1]>0?"YES":"NO");
	}

}
