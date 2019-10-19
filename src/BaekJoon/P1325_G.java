package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1325_G {

	static ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[10001];
	static boolean[]v;
	static int[] ans = new int[10001];
	static int cnt = 0;
	
	static void o(int i) {
		v[i]=true;
		for(int j:a[i]) {
			if(!v[j]) {
				ans[j]++;
				o(j);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer t=new StringTokenizer(r.readLine());
		int n=Integer.parseInt(t.nextToken()),m,i,j;
		for(i=n;i>0;i--)a[i]=new ArrayList<Integer>();
		for(m=Integer.parseInt(t.nextToken());m>0;m--) {
			t=new StringTokenizer(r.readLine());
			a[Integer.parseInt(t.nextToken())].add(Integer.parseInt(t.nextToken()));
		}
		m=0;
		for(i=1;i<=n;i++) {
			v=new boolean[10001];
			o(i);
		}
		for(i=1;i<=n;i++)m=m>ans[i]?m:ans[i];
		for(i=1;i<=n;i++)if(m==ans[i])w.write(i+" ");
		w.flush();
	}
}