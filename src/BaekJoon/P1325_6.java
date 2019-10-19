package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		String[]q=r.readLine().split(" ");
		n=Integer.parseInt(q[0]);
		D=new int[n];
		N=new boolean[n][n];
		for(int m=Integer.parseInt(q[1]);m>0;m--) {
			q=r.readLine().split(" ");
			N[Integer.parseInt(q[1])-1][Integer.parseInt(q[0])-1]=true;
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