package _Algorithm.String.KMP;

import java.io.*;

// 가장 작은 패턴에 속하면 패턴 탐색에서 제외
// 가 아님 보류

public class P4354 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		while(!(s=r.readLine()).equals(".")) {
			char[]a=s.toCharArray();
			boolean[]b=new boolean[a.length];
			int i=0,l=a.length,j,k=0;
			for(;i<l;i++) {
				j=0;
				if(!b[i]) {
					
				}
			}
		}
	}

}
