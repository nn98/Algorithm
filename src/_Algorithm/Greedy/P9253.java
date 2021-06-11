package _Algorithm.Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9253 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		char[][]a=new char[3][];
		int i=0,j=0,k=0,b[]=new int[3],x=0;
		for(;i<3;a[i]=r.readLine().toCharArray(),b[i]=a[i++].length);
		for(i=0;i<b[0]&j<b[1]&x<1;) {
			while(a[0][i]==a[2][k])i++;
			while(a[1][j]==a[2][k])j++;
			for(;k<b[2];) {
				if(a[0][i]!=a[2][k])k=0;
				if(a[1][j]!=a[2][k])k=0;
				i++;
				j++;
			}
			if(k==b[2])x++;
		}
		System.out.print(x==0?"NO":"YES");
	}

}
