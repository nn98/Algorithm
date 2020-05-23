package _Algorithm.DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P11400 {

	static List[]l,c;
	static int num,dis[],i,j;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int v=s.nextInt()+1,e=s.nextInt();
		dis=new int[v];
		l=new ArrayList[v];
		c=new ArrayList[v];
		for(i=v;i-->1;l[i]=new ArrayList());
		for(;e-->0;i=s.nextInt(),j=s.nextInt(),l[i].add(j),l[j].add(i));
	}

}
