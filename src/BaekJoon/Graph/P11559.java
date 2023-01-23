package BaekJoon.Graph;

import java.io.*;

public class P11559 {

	static char[]R,a[]=new char[14][8];
	static boolean b[][],c;
	static int[]X= {0,1,0,-1},Y= {1,0,-1,0};
	static void o(int x,int y,int z,char k) {
		
	}
	
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int i=0,j,x=0;
		for(;i<12;i++) {
			R=r.readLine().toCharArray();
			j=1;
			for(char c:R)a[i][j++]=c;
		}
		b=new boolean[14][8];
		i--;
		j=5;
		while(!c)o(i,j,0,'0');
	}

}
