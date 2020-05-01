package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 백트래킹 DFS BFS

public class P6443 {

	static BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	static int n,i;
	static char[]p,f=new char[1001];
	
	static void D(int x,int d)throws Exception{
		if(d==n) {
			w.write(f.toString()+"\n");
			return;
		}
		for(int j=0;j<26;j++)
			if(p[j]>0) {
				p[j]--;
				f[x]=(char)('a'+j);
				D(j,x+1);
				p[j]++;
			}
	}
	
	public static void main(String[] args)throws Exception{
		n=Integer.parseInt(r.readLine());
		for(;i<n;i++) {
			p=new char[26];
			for(char j:r.readLine().toCharArray())p[j-'a']++;
			D(0,0);
		}
		w.flush();
	}

}
