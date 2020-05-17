package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P16916_4 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		char[]a=r.readLine().toCharArray(),b=r.readLine().toCharArray();
		int i=0,j,r,A=a.length,B=b.length,c=0;
		for(;i<A&&c==0;i++)
			if(a[i]==b[0]) {
				r=0;
				for(j=0;i+j<A&&j<B;j++)
					if(a[i+j]==b[j])r++;
					else break;
				if(r==B)c++;
			}
		System.out.print(c);
	}

}