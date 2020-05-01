package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 백트래킹 DFS BFS

public class P6443 {

	static BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	static int n,m,k;
	static char[]p,f=new char[1001],a;
	
	static void D(int x,int d)throws Exception{
		if(d==n) {
			w.write(String.valueOf(f)+"\n");
			return;
		}
		for(int i=0;i<26;i++)
			if(0<p[i]) {
				p[i]--;
				f[d]=(char)('a'+i);
				D(i,d+1);
				p[i]++;
			}
	}
	
	public static void main(String[] args)throws Exception{
		n=Integer.parseInt(r.readLine());
		for(;k<n;k++) {
			p=new char[26];
			a=r.readLine().toCharArray();
			m=a.length;
			for(char j:a)p[j-'a']++;
			D(0,0);
		}
		w.flush();
	}

}
