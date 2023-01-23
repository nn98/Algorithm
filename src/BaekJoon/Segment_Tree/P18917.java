package BaekJoon.Segment_Tree;
//https://www.acmicpc.net/problem/18917
//수열과 쿼리 38
import java.io.*;
import java.util.*;
public class P18917 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		long n=Integer.parseInt(r.readLine()),j,u=0,o=0,x=1;
		for(;n-->0;) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			switch(Integer.parseInt(t.nextToken())) {
			case 1:
				j=Integer.parseInt(t.nextToken());
				u+=j;
				o^=j;
				break;
			case 2:
				j=Integer.parseInt(t.nextToken());
				u-=j;
				o^=j;
				break;
			case 3:
				w.write(u+"\n");
				break;
			case 4:
				w.write(o+"\n");
			}
		}
		w.flush();
	}
}