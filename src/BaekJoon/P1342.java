package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1342 {
	static BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	static int n,m,k,R;
	static char[]p=new char[26],f=new char[1001],a;

	static void D(int x,int d)throws Exception{
		if(d==m) {
//			System.out.println(String.valueOf(f));
			boolean c=true;
			for(int i=1;i<m&&c;c=f[i]!=f[i++-1]);
			if(c)R++;
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
		a=r.readLine().toCharArray();
		m=a.length;
		for(char j:a)p[j-'a']++;
		D(0,0);
//		for(int G=0;G<26;G++)p[G]=0;
		System.out.println(R);

	}
}