package BaekJoon.DFS;
import java.io.*;
import java.util.*;
public class P2251 {
	static int i,w[]=new int[3],h[][]=new int[201][201];
	static List<Integer>l=new ArrayList();
	static void o(int a,int b,int c) {
		if(h[a][b]>0)return;
		if(a==0)l.add(c);
		h[a][b]++;
		if(a+b>w[1])o(a+b-w[1],w[1],c);
		else o(0,a+b,c);
		if(a+b>w[0])o(w[0],a+b-w[0],c);
		else o(a+b,0,c);
		if(c+a>w[0])o(w[0],b,a+c-w[0]);
		else o(a+c,b,0);
		if(c+b>w[1])o(a,w[1],b+c-w[1]);
		else o(a,b+c,0);
		o(a,0,b+c);
		o(0,b,a+c);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<3;w[i++]=Integer.parseInt(t.nextToken()));
		o(0,0,w[2]);
		Collections.sort(l);
		for(int x:l)System.out.print(x+" ");
	}
}