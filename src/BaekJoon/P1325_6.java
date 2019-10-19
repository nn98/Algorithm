package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class P1325_6 {
	static int n,D[],p=0;
	static boolean N[][],H[];
	static void o(int i) {
		int u=1;
		for(int j=0;j<n;j++) {
			if(N[i][j]) {
				if(D[j]==0)o(j);
				u+=D[j];
			}
		}
		D[i]=u;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		n=Integer.parseInt(t.nextToken());
		D=new int[n];
		N=new boolean[n][n];
		for(int m=Integer.parseInt(t.nextToken());m>0;m--) {
			t=new StringTokenizer(r.readLine());
			int k=Integer.parseInt(t.nextToken())-1;
			N[Integer.parseInt(t.nextToken())-1][k]=true;
		}
		for(int i=0;i<n;i++) {
			if(D[i]==0)o(i);
			p=p>D[i]?p:D[i];
		}
		for(int i=0;i<n;i++)
			if(D[i]==p)
				w.write(i+1+" ");
		w.flush();
	}
}